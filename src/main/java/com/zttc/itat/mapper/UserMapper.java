package com.zttc.itat.mapper;

import com.zttc.itat.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2018-12-19 上午 10:34
 */
public interface UserMapper {
    @Select("select * from user where name=#{name}")
    User findByName(@Param("name") String name);

    @Insert("insert into user(id,name,age) values(default,#{name},#{age})")
    int insert(@Param("name") String name,@Param("age") Integer age);
}
