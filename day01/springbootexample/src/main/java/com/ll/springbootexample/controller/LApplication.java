package com.ll.springbootexample.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/9/15 0015 上午 11:41
 */

@EnableAsync
@SpringBootApplication
@ComponentScan(basePackages="com.ll")
public class LApplication {
    public static void main(String[] args) {
        SpringApplication.run(LApplication.class);
    }

}
