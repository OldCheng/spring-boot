package com.example.introduction.module.test;

import com.example.introduction.module.proxy.MyInvocationHandler;
import com.example.introduction.module.service.HelloService;
import com.example.introduction.module.service.impl.HelloServiceImpl;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author 程杰
 * @Date 2020/12/30 11:15
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        //我们要代理的真实对象
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
        //InvocationHandler不是proxy，只是一个帮助proxy的类。proxy会把调用转发给它处理。
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(helloServiceImpl);

        Arrays.stream(helloServiceImpl.getClass().getInterfaces()).forEach(System.out::println);

        Arrays.stream(helloServiceImpl.getClass().getInterfaces()).forEach(s-> System.out.println(s.getSimpleName()));

        HelloService helloService =
                (HelloService) Proxy.newProxyInstance(helloServiceImpl.getClass().getClassLoader()
                        , helloServiceImpl.getClass().getInterfaces()
                        ,myInvocationHandler);

        System.out.println(helloServiceImpl.getClass().getName());
        helloService.helloWorld();
        helloService.sayHello("zhangSan");

    }
}
