package com.liub.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * User
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/20.  @version：${VERSION}
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String userPass;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @NotNull(message = "用户名不能为空")
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    @NotNull(message = "密码不能为空")
    @Column(name = "user_pass")
    public String getUserPass() {
        return userPass;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User, {");
        sb.append("id=");
        sb.append(id);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", userPass=");
        sb.append(userPass);
        sb.append('}');
        return sb.toString();
    }
}
