package com.example.introduction.module.intercepte;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author 程杰
 * @Date 2020/12/29 18:15
 * @Version 1.0
 */
public class MyInterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("before----------------------------");
        return false;
    }

    @Override
    public void after() {
        System.out.println("after----------------------------");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before----------------------------");
        Object proceed = invocation.proceed();

        System.out.println("around after----------------------------");
        return proceed;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning----------------------------");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing----------------------------");
    }

    @Override
    public boolean useAround() {
        return false;
    }
}
