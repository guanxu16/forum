package com.forum.mapper;

import com.forum.model.Topic;

import java.util.List;


public interface TopicMapper {

    List<Topic> listTopic();

    List<String> listImage();

}
