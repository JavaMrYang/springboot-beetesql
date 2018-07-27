package com.example.springbootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootConfigApplication {

	public static void main(String[] args) {
		System.out.println("我执行了");
		SpringApplication.run(
				SpringbootConfigApplication.class, args
		);
	}
}
