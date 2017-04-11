package com.forum.mapper;

import com.forum.BaseTest;
import com.forum.dto.Page;
import com.forum.model.Post;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gxlly on 2017/4/11.
 */
public class PostMapperTest extends BaseTest {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void listPagePostByTid() throws Exception {

        Map<String,Object> condition = new HashMap<>();
        Page page = new Page(1,20,"order by publish_time desc");
        condition.put("tid",10);
        List<Post> postList = postMapper.listPagePostByTid(condition,page);
        System.out.println(Arrays.toString(postList.toArray()));
    }
}