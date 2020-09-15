package com.ll.springbootexample.controller;


import com.ll.springbootexample.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/9/15 0015 上午 11:38
 */
@RequestMapping("/hello")
@RestController
public class HelloController {
    @Autowired
    private Environment environment;

    // 注入配置
    @Value("${server.port}")
    private String port;

    @Autowired
    private MyConfig myConfig;


    @RequestMapping("/hello1")
    public String hello1() {
        return "hello1";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        // 读取配置
        String port = "hello2 " + environment.getProperty("server.port");
        return port;
    }

    @RequestMapping("/hello3")
    public String hello3() {
        // 读取配置
        port = "hello3 " + port;
        return port;
    }

    @RequestMapping(value="/hello4", produces = "application/json;charset=utf-8")
    public String hello4() {
        System.out.println(myConfig.getName());
        return myConfig.getName()+"刘";
    }


}
