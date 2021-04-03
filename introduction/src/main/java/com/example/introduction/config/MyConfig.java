package com.example.introduction.config;

import com.example.introduction.module.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.配置类里面使用@Bean 标注在方法上给容器注册组件。默认是单例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods  代理bean方法
 *  full模式（proxyBeanMethods = true）全配置
 *  lite 模式（proxyBeanMethods = false）轻量配置
 *  组件以来
 * @Description
 * @Author 程杰
 * @Date 2021/4/3 23:10
 * @Version 1.0
 */
@Configuration(proxyBeanMethods = true)  //告诉springboot这是一个配置类 == 配置文件
public class MyConfig {

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    @Bean    //给容器添加有一个组件，以方法名称作为组件id，返回类型就是组件类型，返回值就是组件在容器中的实例
    public Student student11(){
        return new Student("zhangsan",9);
    }
}
