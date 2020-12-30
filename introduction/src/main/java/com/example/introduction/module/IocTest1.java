package com.example.introduction.module;

import com.example.introduction.module.entity.Person;
import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.PersonService;
import com.example.introduction.module.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @Author 程杰
 * @Date 2020/12/28 19:31
 * @Version 1.0
 */
public class IocTest1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig1.class);
        applicationContext.close();
    }
}
