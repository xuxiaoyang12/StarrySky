package com.starry.sky.web;

import com.starry.sky.main.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 测试类
 */
@SpringBootApplication
@SpringApplicationConfiguration(classes = HelloController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HelloApplicationTests {
    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }


    @Test
    public void hello() throws Exception {
//        mvc.perform(MockMvcRequestBuilders
//                .get("/hello")
//                .accept(MediaType.APPLICATION_JSON)
//        )
//                .andExpect(status().isOk())
//                ;

    }


}
