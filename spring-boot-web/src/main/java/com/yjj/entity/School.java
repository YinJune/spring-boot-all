package com.yjj.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: Yin JunJie
 * @Date: 2019/12/24 16:02
 * @Description:
 */
public class School {
    @NotEmpty(message = "学校名称不能为空")
    private String schoolName;
    @Length(min = 4,max = 10)
    private String schoolAddress;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
}
