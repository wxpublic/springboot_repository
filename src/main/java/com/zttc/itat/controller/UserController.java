package com.zttc.itat.controller;

import com.zttc.itat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description: 测试MyBatis整合SpringBoot
 * @author: ChenRuiQing.
 * Create Time:  2018-12-19 上午 11:10
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/insertUser")
    public Integer insertUser(String name,Integer age){
        return userService.insertUser(name,age);
    }
}
