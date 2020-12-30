package com.example.introduction.module.test;

import com.example.introduction.module.AppConfig;
import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author 程杰
 * @Date 2020/12/30 17:22
 * @Version 1.0
 */
@SpringBootTest
@Component
public class TestAop {

    @Autowired
    UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setId(123L);
        user.setUserName("lisi");
        user.setNote("dmj");
        userService.printUser(user);
    }
}
