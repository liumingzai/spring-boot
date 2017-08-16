package com.liub.controller;

import com.liub.domain.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RedisContrller
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/9.  @version：${VERSION}
 */
@RestController
public class RedisContrller {


    @Autowired
    private RedisTemplate<String, Demo> redisTemplate;

    @GetMapping("addRedis")
    public void addRedis(){
        // 保存对象
        Demo user = new Demo("超人", "Superman");
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new Demo("蝙蝠侠", "Spiderman");
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new Demo("蜘蛛侠", "Batman");
        redisTemplate.opsForValue().set(user.getUsername(), user);
    }

}
