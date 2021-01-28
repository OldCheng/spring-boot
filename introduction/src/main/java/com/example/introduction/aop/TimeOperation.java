package com.example.introduction.aop;

import java.lang.annotation.*;

/**
 * @Author 程杰
 * @Date 2021/1/23 15:07
 * @Version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE})
public @interface TimeOperation {
    String name() default "";
}
