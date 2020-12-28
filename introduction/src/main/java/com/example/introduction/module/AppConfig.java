
package com.example.introduction.module;

import com.example.introduction.module.entity.Person;
import com.example.introduction.module.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

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
@ComponentScan()
public class AppConfig {

    /**
     * @Bean 代表将 initUser 方法返回的 POJO 装配到 IoC 容器中，而其
     * 属性 name 定义这个 Bean 的名称，如果没有配置它，则将方法名称“ initUser”作为 Bean 的名称保
     * 存到 Spring IoC 容器中 。
     */
    @Bean(name = "users")
    public User initUser(){
        User user = new User();
        user.setId (1L);
        user.setUserName ("user name l ");
        user.setNote ("note l ") ;
        return user;
    }

}
