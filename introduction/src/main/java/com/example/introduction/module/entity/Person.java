package com.example.introduction.module.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author 程杰
 * @Date 2020/12/28 19:26
 * @Version 1.0
 */
@Component
public class Person {

    @Value("2")
    private Long id ;
    @Value("zhangsan")
    private String userName;
    @Value("note_2")
    private String note ;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
