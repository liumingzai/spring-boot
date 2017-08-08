package com.liub.domain;

import org.bson.types.ObjectId;

import javax.persistence.Id;

/**
 * Liub
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/8.  @version：${VERSION}
 */
public class Liub {

    @Id
    private ObjectId id;

    private String name;
    private Double age;
    private String sex;
    private String address;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Liub, {");
        sb.append("id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", age=");
        sb.append(age);
        sb.append(", sex=");
        sb.append(sex);
        sb.append(", address=");
        sb.append(address);
        sb.append('}');
        return sb.toString();
    }
}
