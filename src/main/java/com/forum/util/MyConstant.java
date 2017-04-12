package com.forum.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConstant {
    //七牛云相关
    public static  String QINIU_IMAGE_URL ;
    public static  String QINIU_ACCESS_KEY ;
    public static  String QINIU_SECRET_KEY ;
    public static  String QINIU_BUCKET_NAME ;
    public static  String MAIL_FROM ;   //发送邮件的邮箱
    public static  String DOMAIN_NAME ;//域名
    //三种操作
    public static final int OPERATION_CLICK_LIKE = 1;
    public static final int OPERATION_REPLY = 2;
    public static final int OPERATION_COMMENT = 3;

    @Value("${qiniu.url}")
    public  void setQiniuImageUrl(String qiniuImageUrl) {
        MyConstant.QINIU_IMAGE_URL = qiniuImageUrl;
    }
    @Value("${qiniu.accessKey}")
    public  void setQiniuAccessKey(String qiniuAccessKey) {
        MyConstant.QINIU_ACCESS_KEY = qiniuAccessKey;
    }
    @Value("${qiniu.secretKey}")
    public  void setQiniuSecretKey(String qiniuSecretKey) {
        MyConstant.QINIU_SECRET_KEY = qiniuSecretKey;
    }
    @Value("${qiniu.bucketName}")
    public  void setQiniuBucketName(String qiniuBucketName) {
        MyConstant.QINIU_BUCKET_NAME = qiniuBucketName;
    }
    @Value("${mail.username}")
    public  void setMailFrom(String mailFrom) {
        MyConstant.MAIL_FROM = mailFrom;
    }
    @Value("${project.domain}")
    public  void setDomainName(String domainName) {
        MyConstant.DOMAIN_NAME = domainName;
    }

}
