package com.example.springbootconfig.controller;

import com.example.springbootconfig.vo.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConfigController {
    @Autowired
    private ConfigBean configBean;
    //读取配置属性devconfig.ip
    @Value("${devconfig.ip}")
    private String ip;
    //读取配置属性devconfig.port
    @Value("${devconfig.port}")
    private String port;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hell0,world"+ip+port;
    }

    @GetMapping(value = "/config")
    public String config(){
        return "ip:"+configBean.getIp()+",port:"+configBean.getPort();
    }
}
