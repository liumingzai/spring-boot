package com.liub;

import com.liub.domain.User;
import com.liub.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UserServiceTest
 * 单元测试-针对service测试
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/21.  @version：${VERSION}
 */

@RunWith(SpringRunner.class)  //底层基于junit
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void findOneTest(){
        User user = userService.findOne(3);
        Assert.assertEquals("webapp1",user.getUserName());

    }
}
