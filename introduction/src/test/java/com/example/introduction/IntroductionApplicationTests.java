package com.example.introduction;

import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class IntroductionApplicationTests {

    @Autowired
    UserService userService;


    @Test
    void contextLoads() {
//
//        TestRestTemplate testRestTemplate = new TestRestTemplate();
//        User u  = testRestTemplate.getForObject("/getUser",User.class);
        User user = userService.getUser();
    }

}
