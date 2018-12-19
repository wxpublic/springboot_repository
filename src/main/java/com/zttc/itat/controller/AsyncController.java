package com.zttc.itat.controller;

import com.zttc.itat.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description: 异步调用技术,Service类中的方法采用@Async注解，异步执行。
 * @author: ChenRuiQing.
 * Create Time:  2018-12-18 上午 10:28
 */
@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;
    @RequestMapping("/asyncExecute")
    public String sendEmailWhenAddUser(){
        System.out.println(111+"Controller");
        String result = asyncService.sendEmailWhenAddUser();
        System.out.println(444+"Controller");
        return result;
    }
}
