package com.yjj.entity;

import javax.validation.constraints.NotEmpty;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/9/3 16:41
 * @Version: 1.0
 */
public class User {
    private Integer id;
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
