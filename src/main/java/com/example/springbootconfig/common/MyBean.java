package com.example.springbootconfig.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
实现ApplicationRunner或CommandLineRunner接口。两个接口以相同的方式工作并提供单个run方法，该方法在SpringApplication.run(…​)完成之前调用 。
 */
@Component
public class MyBean implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("我在spring启动类之后运行");
    }
}
