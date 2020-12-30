package com.example.introduction.module.service.impl;

import com.example.introduction.module.entity.Person;
import com.example.introduction.module.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @Author 程杰
 * @Date 2020/12/28 20:05
 * @Version 1.0
 */
public class PersonServiceImpl implements PersonService {

    @Override
    public void init(){
        System.out.println("执行PersonService的初始化回调方法init");
    }

    @Override
    public void destroy(){
        System.out.println("执行PersonService的初始化回调方法destroy");
    }
}
