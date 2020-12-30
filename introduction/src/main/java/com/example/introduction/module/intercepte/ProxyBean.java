package com.example.introduction.module.intercepte;

import com.example.introduction.module.service.HelloService;
import com.example.introduction.module.service.impl.HelloServiceImpl;

/**
 * @Author 程杰
 * @Date 2020/12/29 18:19
 * @Version 1.0
 */
public class ProxyBean {
    public static Object getProxyBean (Object target, Interceptor interceptor ) {
        HelloService helloService =new HelloServiceImpl();
        HelloService proxy = (HelloService)ProxyBean.getProxyBean(helloService, new MyInterceptor()) ;
        return proxy;
    }
}
