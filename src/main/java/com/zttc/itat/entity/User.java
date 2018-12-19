package com.zttc.itat.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

/**
 * @version 1.0
 * @Description: @Data = @Getter + @Setter
 * @author: ChenRuiQing.
 * Create Time:  2018-12-17 下午 9:21
 */
@Data
public class User {
    private Integer id;
//    @Getter
//    @Setter
    private String name;
//    @Getter
//    @Setter
    private Integer sex;
//    @Getter
//    @Setter
    private Integer age;
//    @Getter
//    @Setter
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
