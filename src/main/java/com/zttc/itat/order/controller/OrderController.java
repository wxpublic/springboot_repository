package com.zttc.itat.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * @url： http://127.0.0.1:8080/orderIndex
 * Create Time:  2018-12-13 下午 7:33
 */
@RestController
public class OrderController {
    //在初始化的时候读取配置文件内容
    @Value("${name}")
    private String name;

    @Value("${http_url}")
    private String httpUrl;

    @RequestMapping("/getHttpUrl")
    public String getHttpUrl(){
        return httpUrl;
    }

    @RequestMapping("/orderIndex")
    public String orderIndex(){
        return "springBoot2.0 ---orderIndex";
    }

    @RequestMapping("/proName")
    public String getName(){
        return name;
    }

}
