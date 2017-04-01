package com.fc.mapper;

import com.fc.service.LoginService;
import com.fc.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml","classpath:spring-redis.xml","classpath:spring-mvc.xml"})
public class UserMapperTest {

    @Autowired
    private LoginService loginService;

    @Autowired
    private PostService postService;


/*    @Test
    public void createUser() throws InterruptedException {
        Random random = new Random();
        for(int i=1;i<=10;i++){
            User user = new User();
            user.setEmail(i+"@"+i+".com");
            user.setPassword("000000");
            loginService.register(user,"000000");
            Thread.sleep(1000);
        }
    }*/

/*    @Test
    public void createPost() throws InterruptedException {
        Random random = new Random();
        for(int i=1;i<=20;i++){
            User user = new User(random.nextInt(10)+1);
            Topic topic = new Topic(random.nextInt(12)+1);
            Post post = new Post();
            post.setUser(user);
            post.setTopic(topic);
            post.setTitle("test"+i);
            post.setContent("test content"+i);
            postService.publishPost(post);
            Thread.sleep(1000);
        }
    }*/

    @Test
    public void tset0(){
        System.out.println("test ok");
    }
}
