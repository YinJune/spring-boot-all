package com.yjj.web;

import com.yjj.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: yinjunjie
 * @CreateDate: 2018/9/3 16:40
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "test")
public class TestValidation {

    @PostMapping("/valide")
    public String validation(@RequestBody @Validated User user, HttpServletRequest request){
        System.out.println(user);
        return user.toString();
    }
}
