package com.example.introduction.module.service;

import com.sun.org.apache.xml.internal.security.Init;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author 程杰
 * @Date 2020/12/28 20:48
 * @Version 1.0
 */

//@Component
public class Lifecycle implements BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("{" + this.getClass().getSimpleName() + "}  调用 BeanFactoryAware 的 setBeanFactory ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("{" + this.getClass().getSimpleName() + "}  调用 BeanNameAware 的 setBeanName ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("{" + this.getClass().getSimpleName() + "}  调用 DisposableBean 方法");
    }

    @PreDestroy
    public void destroy1() throws Exception {
        System.out.println("{" + this.getClass().getSimpleName() + "}  注解 @PreDestroy 定义的自定义销毁方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("{" + this.getClass().getSimpleName() + "}  调用 InitializingBean 的 afterPropertiesSet 方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("{" + this.getClass().getSimpleName() + "}  调用 ApplicationContextAware 的 setAppli cationContext ");
    }

    @PostConstruct
    public void init() {
        System.out.println("{" + this.getClass().getSimpleName() + "}  注解 @PostConstruct 定义的自定义初始化方法");
    }
}
