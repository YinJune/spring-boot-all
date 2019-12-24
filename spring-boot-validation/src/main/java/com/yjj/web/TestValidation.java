package com.yjj.web;

import com.alibaba.fastjson.JSONObject;
import com.yjj.entity.Student;
import com.yjj.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/9/3 16:40
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "test")
public class TestValidation {

    @PostMapping("/post")
    public String testPost(@RequestBody @Validated User user, HttpServletRequest request){
        Student student=new Student();
        BeanUtils.copyProperties(user,student);
        System.out.println(JSONObject.toJSONString(student));
        List a=user.getSchoolList();
        List b=student.getSchoolList();
        System.out.println(a==b);
        return JSONObject.toJSONString(student);
    }

    @GetMapping("/get")
    public String testGet(User user, HttpServletRequest request){
        System.out.println(user);
        return user.toString();
    }

    /**
     * @RequestBody 即使是get 也必须要加一个{}在body体
     */
//    @GetMapping("/get")
//    public String testGet(@RequestBody @Validated User user, HttpServletRequest request){
//        System.out.println(user);
//        return user.toString();
//    }
}
