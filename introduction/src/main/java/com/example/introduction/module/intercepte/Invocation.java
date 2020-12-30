package com.example.introduction.module.intercepte;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author 程杰
 * @Date 2020/12/29 18:10
 * @Version 1.0
 */
public class Invocation {

    private Object[] params;
    private Method method ;
    private Object target ;

    public Invocation (Object target, Method method , Object[] params ) {
        this.target = target;
        this.method = method;
        this.params = params;
    }

    //反射方法
    public Object proceed() throws
            InvocationTargetException, IllegalAccessException {
        return method.invoke(target, params);
    }
}
