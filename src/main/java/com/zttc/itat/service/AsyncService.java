package com.zttc.itat.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2018-12-18 上午 10:29
 * @Async 异步执行从而不等待返回值；此注解相当于方法重新开辟了一个线程执行
 */
@Service
@Slf4j
public class AsyncService {
    @Async //异步执行从而不等待返回值；此注解相当于方法重新开辟了一个线程执行
    public String sendEmailWhenAddUser(){
        System.out.println(222+"Service");
        try {
            Thread.sleep(5000);
            return "sendEmailReturnVal_First";
        } catch (InterruptedException e) {
        }
        System.out.println(333+"Service");
        return null;
    }
}
