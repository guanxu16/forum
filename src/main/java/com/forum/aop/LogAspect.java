package com.forum.aop;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gxlly on 2017/4/1.
 * TODO 切面记录日志
 */

@Aspect
@Component
public class LogAspect {

    private final Logger logger = Logger.getLogger(LogAspect.class);

    private String requestPath = null;//请求地址

    private String uid = null;//用户编号

    private String requestMethodName = null;//请求方法

    private Object[] parameters=null;//请求参数

    private Map<String,Object> returnResult=null;//请求结果

    private long startTimeMillis;//开始时间

    private long endTimeMillis;//结束时间

    @Pointcut("execution(* com.forum.service.PostService.listPostByTime(..))")
    public void pointCut(){

    }

    @Before(value = "pointCut()")
    public void doBeforeInServiceLayer(JoinPoint joinPoint){
        startTimeMillis=System.currentTimeMillis();
    }

    @After(value = "pointCut()")
    public void doAfterInServiceLayer(JoinPoint joinPoint){
        endTimeMillis = System.currentTimeMillis();
        printLog();
    }

    @Around(value = "pointCut()")
    public Object doAroundInServiceLayer(ProceedingJoinPoint pjp)throws Throwable{

        /**
         * 1.获取request信息
         * 2.根据request获取session
         * 3.从session中取出登录用户信息
         */
        ServletRequestAttributes ra = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = ra.getRequest();
        HttpSession session = httpServletRequest.getSession();
        uid = session.getAttribute("uid")==null?"未登录":session.getAttribute("uid").toString();
        parameters = pjp.getArgs();
        requestPath = httpServletRequest.getRequestURI();
        returnResult = new HashMap<String,Object>();
        requestMethodName = pjp.getSignature().getDeclaringTypeName()+"."+pjp.getSignature().getDeclaringTypeName();
        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        Object result = pjp.proceed();
        returnResult.put("result",result);
        returnResult.put("resultType",result.getClass().getName());
        return returnResult;
    }


    private void printLog(){
        String optTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTimeMillis);
        logger.info("\n 用户:"+uid
                + ",请求URI:"+requestPath
                + ",请求时间:"+optTime
                +",用时："+(endTimeMillis-startTimeMillis)+"ms"
                +"方法："+requestMethodName
                +",参数："+ Arrays.toString(parameters)
                +"返回："+ JSONObject.toJSONString(returnResult));


    }

}
