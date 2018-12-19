package com.zttc.itat.service;

import com.zttc.itat.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2018-12-19 上午 10:54
 */
@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 整合mybatis方法练习
     * @param name
     * @param age
     * @return
     */
    public int insertUser(String name, Integer age){
        int insertUserResult = userMapper.insert(name,age);
        log.info("###UserService###inserUser方法返回值insertUserResult:{}",insertUserResult);
        return insertUserResult;
    }
}
