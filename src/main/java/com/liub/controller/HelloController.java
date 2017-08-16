package com.liub.controller;

import com.liub.properties.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * HelloController
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/20.  @version：${VERSION}
 */


@Controller
public class HelloController {

    /*@Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    @Value("${content}")
    private String content;*/

    @Autowired
    private UserProperties userEntity;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello " + userEntity.getName();
    }


    //Get请求简写
    @GetMapping(value = "/hi")
    public String hi(){
        return "hi " + userEntity.getName();
    }



    //通过chrome的postman模拟post请求,此处返回的是index.html模板，cibug未修复
    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(){
        return "index";
    }

    //带参数的请求1 hello/100
    @RequestMapping(value = "/say1/{id}",method = RequestMethod.GET)
    public String sapId(@PathVariable("id") Integer id){
        return "id: " +  id;
    }

    //带参数的请求2 ?id = 100
    @RequestMapping(value = "/say2",method = RequestMethod.GET)
    public String sayId2(@RequestParam("id") Integer sid){
        return "id: " +  sid;
    }
}
