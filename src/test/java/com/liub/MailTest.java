package com.liub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * MailTest
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/8.  @version：${VERSION}
 */
@RunWith(SpringRunner.class)  //底层基于junit
@SpringBootTest
public class MailTest {

    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void testSendMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("binlingexia@163.com");
        message.setTo(new String[]{"343282971@qq.com","602091629@qq.com"});
        message.setSubject("spring boot 整合mail发邮件");
        message.setText("刘明仔测试专用");
        mailSender.send(message);

    }


}
