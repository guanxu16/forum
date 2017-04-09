package com.forum.controller;

import com.forum.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * Created by raytine on 2017/4/9.
 */
public class IndexControllerTest extends BaseTest {
    private MockMvc mockMvc;
    @Autowired
    private IndexController indexController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
    }

    @Test
    public void toIndex() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/toIndex.do"))
                .andExpect((MockMvcResultMatchers.view().name("index")))
                .andReturn();
    }

    @Test
    public void upload() throws Exception {

    }

}