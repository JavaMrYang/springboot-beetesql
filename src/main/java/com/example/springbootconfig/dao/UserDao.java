package com.example.springbootconfig.dao;

import com.example.springbootconfig.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@SqlResource("user")
public interface UserDao extends BaseMapper<User>{
    @SqlStatement(params = "name")
    User findUserByName(String name);


}
