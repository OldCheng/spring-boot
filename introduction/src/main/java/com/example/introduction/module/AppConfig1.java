
package com.example.introduction.module;

import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 程杰
 * @Date 2020/12/28 19:28
 * @Version 1.0
 */

/**
 * @Configuration: 代表这是一个 Java 配置文件 ， Spring 的容器会根据它来生成 IoC 容器去装配 Bean;
 * @ComponentScan: 意味着它会进行扫描，但是它只会扫描类 AppConfig 所在的当前包和其子包
 *
 * @ComponentScan 几种方式：
 * @ComponentScan("com.example.introduction.module.*")
 * @ComponentScan(basePackages = "com.example.introduction.module.entity")
 * @ComponentScan(basePackageClasses = Person.class)
 */

@Configuration
@ComponentScan(basePackages = "com.example.introduction.module.*"
        //, excludeFilters = {@ComponentScan.Filter(classes = TestService.class)}
        )
public class AppConfig1 {


}
