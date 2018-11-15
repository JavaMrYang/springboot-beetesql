package com.example.springbootconfig;

import com.alibaba.fastjson.JSON;
import com.example.springbootconfig.domain.User;
import com.example.springbootconfig.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigApplicationTests {

	@Autowired
	private UserServiceImpl userService;
	@Test
	public void contextLoads() {
	}


	@Test
	public void test(){
		for(int i=1;i<=5;i++){
			User user=new User();
			user.setId(i);
			user.setAge(i+18);
			user.setCreateTime(new Date());
			userService.saveUser(user);
		}
	}

	@Test
	public void testFind(){
		System.out.println(JSON.toJSON(userService.findUserByName("张三")).toString());
	}
}
