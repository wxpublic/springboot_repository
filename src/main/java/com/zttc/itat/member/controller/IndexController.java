package com.zttc.itat.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * @url： http://127.0.0.1:8080/index
 * Create Time:  2018-12-13 下午 6:40
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "springBoot 2.0 ---IndexController";
    }
}
