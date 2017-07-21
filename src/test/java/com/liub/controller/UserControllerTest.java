package com.liub.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * UserControllerTest
 * 单元测试-针对
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/21.  @version：${VERSION}
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc   //注意对api测试要引入mockMvc与service的方法测试不同
public class UserControllerTest {
    /**
     * 这个只对方法测试，相对url进行拦截并测试
     * @throws Exception


    @Autowired
    private UserController userController;



    @Test
    public void getUsers() throws Exception {
        userController.getUsers();
    }
     */

    @Autowired
    private MockMvc mvc;

    @Test
    public void getUsers() throws Exception {
        //get方法接url地址
       mvc.perform(MockMvcRequestBuilders.get("/user")).andExpect(MockMvcResultMatchers.status().isOk());
//       .andExpect(MockMvcResultMatchers.content().string("123"));
    }
}