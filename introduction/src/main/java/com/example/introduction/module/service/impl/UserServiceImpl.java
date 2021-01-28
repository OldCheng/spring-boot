package com.example.introduction.module.service.impl;

import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.PersonService;
import com.example.introduction.module.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author 程杰
 * @Date 2020/12/28 20:05
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String printUser(User user) {

        System.out.println("--------进入方法---------");
        if(user == null){
            throw new RuntimeException("user 信息为空");
        }
        System.out.println(user);
        return "name_user";
    }

    @Override
    public User getUser() {

        User user = new User();
        user.setId(789L);
        user.setUserName("zhangsan");
        user.setNote("zzzzzsssss");
        return user;
    }
}
