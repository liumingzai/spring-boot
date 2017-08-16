package com.liub.domain;

import java.io.Serializable;

/**
 * Demo（redis实体）
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/9.  @version：${VERSION}
 */
public class Demo implements Serializable{

    private static final long serialVersionUID = -1L;

    private String username;
    private String password;

    public Demo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Demo, {");
        sb.append("username=");
        sb.append(username);
        sb.append(", password=");
        sb.append(password);
        sb.append('}');
        return sb.toString();
    }
}
