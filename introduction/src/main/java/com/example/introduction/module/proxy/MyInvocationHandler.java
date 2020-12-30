package com.example.introduction.module.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author 程杰
 * @Date 2020/12/30 10:58
 * @Version 1.0
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //在调用真实对象方法前我们可以添加一些自己的操作
        System.out.println("before hello world!");

        System.out.println("Method:" + method);

        //通过Method类调用真实对象的方法
        method.invoke(target, args);

        //在调用真实对象方法后我们也可以添加一些自己的操作
        System.out.println("after hello world!");

        return null;
    }
}
