package com.example.introduction.module.service.impl;

import com.example.introduction.module.service.HelloService;

/**
 * @Author 程杰
 * @Date 2020/12/29 17:54
 * @Version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name == null || name.trim() == ""){
            throw new RuntimeException ("parameter is null ! ! ") ;
        }
        System.out.println("hello :"+name);
    }

    @Override
    public void helloWorld() {
        System.out.println("=========hello World!");
    }
}
