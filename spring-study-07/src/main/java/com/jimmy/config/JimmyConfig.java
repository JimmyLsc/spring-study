package com.jimmy.config;

import com.jimmy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration //这个也会被Spring容器托管，注册到容器中
@ComponentScan("com.jimmy.pojo")
public class JimmyConfig {

    //注册一个bean，就相当于之前写的一个bean标签
    @Bean
    public User user(){
        return new User();
    }
}
