package com.example.springbootconfig.service;

import com.example.springbootconfig.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
   void saveUser (User user);

   User findUserByName(String name);
}
