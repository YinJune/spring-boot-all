package com.yjj.entity;

/**
 * @Author: Yin JunJie
 * @Date: 2019/12/24 17:15
 * @Description:
 */
public class Student extends User{
    /**
     * 年级
     */
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
