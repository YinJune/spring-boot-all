package com.yjj.web;

import com.alibaba.fastjson.JSONObject;
import com.yjj.entity.Student;
import com.yjj.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "用户接口")
@RestController
@RequestMapping(value = "test")
public class TestValidation {

    @ApiOperation(value = "添加用户value",notes = "添加用户note")
    @PostMapping("/user/add")
    public String addUser(@RequestBody @Validated User user, HttpServletRequest request){
        Student student=new Student();
        BeanUtils.copyProperties(user,student);
        System.out.println(JSONObject.toJSONString(student));
        List a=user.getSchoolList();
        List b=student.getSchoolList();
        System.out.println(a==b);
        return JSONObject.toJSONString(student);
    }

    @ApiOperation(value = "获取用户",notes = "获取用户note")
    @GetMapping("/user/get")
    public String getUser(@RequestParam("userId")Integer userId, HttpServletRequest request){
        return "success";
    }
}
