package com.example.springbootconfig.dao;

import com.example.springbootconfig.domain.User;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

@SqlResource("user")
public interface UserDao extends BaseMapper<User>{
    @SqlStatement(params = "name")
    User findUserByName(String name);


}
