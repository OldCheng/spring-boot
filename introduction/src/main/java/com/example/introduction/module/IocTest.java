package com.example.introduction.module;

import com.example.introduction.module.entity.Person;
import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.TestService;
import com.example.introduction.module.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 程杰
 * @Date 2020/12/28 19:31
 * @Version 1.0
 */
public class IocTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = applicationContext.getBean(User.class);
        //User users = (User) applicationContext.getBean("users");
        Person person = applicationContext.getBean(Person.class);

        System.out.println(user);
        System.out.println(person);
        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig1.class);
        TestService testService = applicationContext1.getBean(TestService.class);
        testService.printUser(new User());

        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig1.class);
        applicationContext2.close();

    }
}
