package com.example.introduction.module.intercepte;

import com.example.introduction.module.service.HelloService;
import com.example.introduction.module.service.impl.HelloServiceImpl;

/**
 * @Author 程杰
 * @Date 2020/12/29 18:23
 * @Version 1.0
 */
public class TestProxy {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        //按约定获取 proxy
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("zhangsan");
        System.out.println("\n ########### ####name is null! ! ###!1#########\n ");
        proxy.sayHello(null);
    }
}
