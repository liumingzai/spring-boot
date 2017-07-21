package com.liub.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * UserEntity
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/20.  @version：${VERSION}
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
