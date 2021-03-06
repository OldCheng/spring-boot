package com.example.introduction.module.service;

import com.example.introduction.module.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author 程杰
 * @Date 2020/12/28 20:05
 * @Version 1.0
 */
@Service
public interface UserService {

    String printUser(User user);

    User getUser();

}
