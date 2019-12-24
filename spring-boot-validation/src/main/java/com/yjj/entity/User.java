package com.yjj.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/9/3 16:41
 * @Version: 1.0
 */
public class User {
    @NotNull(message = "id不能为空")
    private Integer id;
    @NotEmpty(message = "姓名不能为空")
    @Length(min = 2,max = 6,message = "姓名不合法")
    private String name;
    /**
     * 年龄
     */
    @Min(value = 18,message = "年龄不能小于18")
    @Max(value = 98,message = "年龄不能大于98")
    private Integer age;
    /**
     * 电话
     */
//    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号不对")
    @Pattern(regexp = "^1[3|4|5|6|7|8|9][0-9]\\d{4,8}$",message = "手机号不对")
    private String mobile;

    @Email(message = "你这邮箱不合法啊")
    private String email;
    /**
     * 学校
     */
    @Valid
    @NotEmpty(message = "学校不能为空")
    private List<School> schoolList;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }
}
