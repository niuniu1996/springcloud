package com.ll.springbootexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/9/15 0015 下午 14:22
 */
@ConfigurationProperties("com.ll")
@Configuration
@Data
public class MyConfig {
    private String name;

    public String getName() {
        return name;
    }
}
