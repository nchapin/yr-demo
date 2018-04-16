package com.example.yrdemo.web.config;

import org.jtwig.spring.JtwigViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class WebConfig {
    @Bean
    public ViewResolver viewResolver () {
        JtwigViewResolver viewResolver = new JtwigViewResolver();
        viewResolver.setPrefix("classpath:/templates/");
        viewResolver.setSuffix(".twig.html");
        viewResolver.setContentType("text/html; charset=UTF-8");
        return viewResolver;
    }
}
