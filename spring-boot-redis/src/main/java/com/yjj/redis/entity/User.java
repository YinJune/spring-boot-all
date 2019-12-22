package com.yjj.redis.entity;

/**
 * @description:
 * @author: Yin JunJie
 * @date: 2019/12/21 13:35
 */
public class User {
    private Integer id;
    private String name;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
