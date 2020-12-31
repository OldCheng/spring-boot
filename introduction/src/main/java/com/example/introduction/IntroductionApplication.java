package com.example.introduction;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.example.introduction.aop.MyAspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.introduction"})
//@SpringBootApplication
public class IntroductionApplication {
//
//    @Bean
//    public MyAspect initMyAspect(){
//        return new MyAspect();
//    };

    public static void main(String[] args) {
        SpringApplication.run(IntroductionApplication.class, args);
    }
}
