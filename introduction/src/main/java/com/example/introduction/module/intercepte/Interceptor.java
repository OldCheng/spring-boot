package com.example.introduction.module.intercepte;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author 程杰
 * @Date 2020/12/29 17:58
 * @Version 1.0
 */
public interface Interceptor {

    public boolean before() ;

    //事后方法
    public void after ();

    /**
     *取代原有事件方法
     * @param invocation 一回调参数 ，可以通过它的 proceed 方法 ， 回调原有事件
     * @return 原有事件返回对象
     * ＠throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Object around(Invocation invocation)throws InvocationTargetException, IllegalAccessException;
    //是否返回方法 。 事件没有发生异常执行

    public void afterReturning() ;
    //事后异常方法 ， 当事件发生异常后执行

    public void afterThrowing ();

    //是否使用 around 方法取代原有方法
    boolean useAround() ;
}
