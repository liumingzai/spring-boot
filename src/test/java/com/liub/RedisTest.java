package com.liub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * RedisTest
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/9.  @version：${VERSION}
 */

@RunWith(SpringRunner.class)  //底层基于junit
@SpringBootTest
public class RedisTest {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void getKeyStringValue(){
      String username =  stringRedisTemplate.opsForValue().get("username");
      System.out.println(username);
    }

}
