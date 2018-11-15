package com.example.springbootconfig.service.impl;

import com.example.springbootconfig.dao.UserDao;
import com.example.springbootconfig.service.UserService;
import com.example.springbootconfig.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userMapper;
    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User findUserByName(String name){
        return userMapper.findUserByName(name);
    }
}
