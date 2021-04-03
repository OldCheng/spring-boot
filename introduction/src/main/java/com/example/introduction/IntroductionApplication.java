package com.example.introduction;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.example.introduction.aop.MyAspect;
import com.example.introduction.config.MyConfig;
import com.example.introduction.module.entity.Student;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableWebSecurity
//@SpringBootApplication(scanBasePackages = {"com.example.introduction"})
@SpringBootApplication
public class IntroductionApplication {
//
//    @Bean
//    public MyAspect initMyAspect(){
//        return new MyAspect();
//    };

    public static void main(String[] args) {
        // 1.返回Ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(IntroductionApplication.class, args);
        // 2.查看容器里的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        //从容器中获取组件
        Student student11 = run.getBean("student11", Student.class);
        System.out.println(student11);

        // 配置类
        MyConfig bean = run.getBean(MyConfig.class);
        // @Configuration(proxyBeanMethods = true) 代理对象调用方法，springboot总会检查这个组件是否存在在容器中，保持组件单实例
        Student student = bean.student11();
        Student student1 = bean.student11();
        System.out.println();
    }
}
