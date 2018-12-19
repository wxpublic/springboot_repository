package com.zttc.itat.log4j.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description: 访问类之后控制台输出WebLogAspect切面类中定义的方法输出；
 * @author: ChenRuiQing.
 * @url：http://127.0.0.1:8080/getMember?name=jack
 * Create Time:  2018-12-17 下午 5:41
 */
@RestController
public class Log4jController {
    @RequestMapping("/getMember")
    public String getMember(String name){
        return "success";
    }
}
