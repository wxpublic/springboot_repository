package com.zttc.itat.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description:  Spring2.0 第一个案例，springCloud 依赖于springBoot实现微服务，
 *                  springBoot默认集成springMVC组建，springCloud使用springMVC编写微服务http接口，
 *                  微服务通讯接口(http+json),所以说springBoot是为微服务作基础，但不代表springBoot就是微服务框架.
 *                  springBoot内置Http服务器,默认是Tomcat Server.
 * @author: ChenRuiQing.
 * @url： http://127.0.0.1:8080/memberIndex
 * Create Time:  2018-12-13 下午 4:56
 */
/**
 * @RestController
 * 表示该类中的所有方法都会返回json格式，他等于(@Controller + @ResponseBody)，该标签是spring4.0已经支持的标签，
 * 不是springBoot标签。其作用是为微服务提供Http请求的返回json格式服务
 */
@RestController
public class MemberController {
    @RequestMapping("/memberIndex")
    public String memberIndex(){
        return "springBoot 2.0 ---MemberController";
    }
}
