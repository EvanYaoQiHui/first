package com.example.demo;
import com.example.demo.controller.CommomtController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CommomtController.class)
//@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private MockMvc mvc;
    @Test
    public void greting() throws Exception {
        this.mvc.perform(get("/greeting")
                .param("name", "yao").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));
    }

    @Test
    public void getFoods() throws Exception {
        this.mvc.perform(get("/sell/buyer/product/list")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));
    }

    @Test
    public void deleteOrder() throws Exception {
     /*   Map<String,Integer> map=new HashMap<>();
        map.put("id",1);*/
        this.mvc.perform(get("/{id}")
                .param("id","1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    public void LoggerTest() throws Exception {

    }

}
