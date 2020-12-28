package com.example.introduction.module.service;

import com.example.introduction.module.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author 程杰
 * @Date 2020/12/28 20:09
 * @Version 1.0
 */
@Service
public class TestService {
    public void printUser(User user){
        System.out.println("编号："+user.getId());
        System.out.println("名称："+user.getUserName());
        System.out.println("备注："+user.getNote());
    }
}
