package com.example.springbootconfig.dao;

import com.example.springbootconfig.domain.User;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

@SqlResource("user")
public interface UserDao extends BaseMapper<User>{
    @SqlStatement(params = "name")
    User findUserByName(String name);

    List<User> findUserByCondition(@Param("age")int age,@Param("name")String name);
}
