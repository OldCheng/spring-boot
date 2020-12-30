package com.example.introduction.module.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author 程杰
 * @Date 2020/12/28 20:59
 * @Version 1.0
 */
//@Component
public class BeanPostProcessorExample implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 调用 "
        + " postProcessBeforeInitialization 方法，参数 {"
                + bean.getClass().getSimpleName()+ "} {" + beanName +"}");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 调用 "
                + " postProcessAfterInitialization 方法，参数 {"
                + bean.getClass().getSimpleName()+ "} {" + beanName +"}");
        return bean;
    }


}
