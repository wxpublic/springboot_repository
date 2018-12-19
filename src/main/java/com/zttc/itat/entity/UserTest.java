package com.zttc.itat.entity;

import lombok.extern.slf4j.Slf4j;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2018-12-17 下午 9:27
 */
@Slf4j
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setSex(0);
        user.setEmail("wxchina@126.com");
        log.info(user.toString());
    }
}
