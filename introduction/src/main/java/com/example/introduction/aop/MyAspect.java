package com.example.introduction.aop;

import com.example.introduction.module.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author 程杰
 * @Date 2020/12/30 15:04
 * @Version 1.0
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut(" execution(* com.example.introduction.module.service.*.*(..))&& bean(userServiceImpl)" )
    public void pointCut(){

    }

    @Before("pointCut() && bean(userServiceImpl)")
    public void before(){
        System.out.println("------aop----before-------------");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("------aop----after-------------");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("------aop----afterReturning-------------");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("------aop----afterThrowing-------------");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("------around----before--------------");
        Object proceed = jp.proceed();
        System.out.println("------around------after------------");
    }

    @Before("pointCut() && args(user)")
    public void beforeParam(JoinPoint jp, User user){
        Object[] args = jp.getArgs();
        System.out.println("---------before--------");
    }

    @Before("pointCut1() && args(user)")
    public void beforeParam1(JoinPoint jp, User user){
        Object[] args = jp.getArgs();
        System.out.println("---------before-111111111111-------");
    }

    @Pointcut(" execution(* com.example.introduction.module.service.*.*(..)) && bean(userServiceImpl)")
    public void pointCut1(){

    }
}
