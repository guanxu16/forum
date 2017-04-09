package com.forum.service;

import com.forum.BaseTest;
import com.forum.model.Topic;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by raytine on 2017/4/9.
 */
public class TopicServiceTest extends BaseTest {
    @Autowired
    private TopicService topicService;
    @Test
    public void listTopic() throws Exception {
        List<Topic> topicList = topicService.listTopic();
        System.out.println(Arrays.toString(topicList.toArray()));
    }

    @Test
    public void listImage() throws Exception {

    }

}