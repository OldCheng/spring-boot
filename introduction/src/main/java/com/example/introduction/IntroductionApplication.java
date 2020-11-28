package com.example.introduction;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IntroductionApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroductionApplication.class, args);
    }
}
