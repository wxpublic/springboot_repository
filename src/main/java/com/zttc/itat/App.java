package com.zttc.itat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
/**
 * 本类将启动代码单独抽取出来，作为启动入口 单独运行
 * @EnableAutoConfiguration
 * 注解:作用在于让 Spring Boot 根据应用所声明的依赖来对 Spring 框架进行自动配置这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
 * 由于spring-boot-starter-web添加了Tomcat和Spring MVC，所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
 *  注解作用范围：默认只扫当前类，这是第一种启动方式;
 * @ComponentScan("com.zttc.itat.member.controller") 注解用于确定扫包范围;
 */
/**
 * @EnableAutoConfiguration
 * @ComponentScan(basePackages = {"com.zttc.itat.member.controller","com.zttc.itat.order.controller"})
 */
/**
 *@SpringBootApplication 本注解等于@EnableAutoConfiguration + @ComponentScan(同级包和包含子包下的所有类)
 */
@SpringBootApplication
@EnableAsync //开启异步调用功能
@MapperScan(basePackages = {"com.zttc.itat.mapper"}) //代替mybatis mapper 类中添加@Mapper注解
public class App{
    public static void main(String[] args){
        //整个项目程序的入口，启动SpringBoot项目，创建内置Tomcat服务器，使用Tomcat加载SpringMVC
        SpringApplication.run(App.class,args);
    }
}
