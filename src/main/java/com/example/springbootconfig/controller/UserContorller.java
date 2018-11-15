package com.example.springbootconfig.controller;

import com.example.springbootconfig.common.ApiResult;
import com.example.springbootconfig.common.Error;
import com.example.springbootconfig.service.impl.UserServiceImpl;
import com.example.springbootconfig.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
public class UserContorller {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/findByName",method = RequestMethod.GET)
    public ResponseEntity<?> findByName(@RequestParam(value = "name")String name){
        User user=userService.findUserByName(name);
        HttpStatus status = user != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<User>(user,status);
    }

    @GetMapping(value= "/saveUser")
    public ResponseEntity<?> saveUser(@Valid User user,BindingResult bindingResult){
       if(bindingResult.hasErrors()){
            ApiResult result=new ApiResult(1L,bindingResult.getFieldError().getDefaultMessage());
            return new ResponseEntity<ApiResult>(result,HttpStatus.EXPECTATION_FAILED);
      }
      user.setCreateTime(new Date());
      userService.saveUser(user);
      Error error=new Error(0,"success");
      return new ResponseEntity<Error>(error, HttpStatus.OK);
    }



}
