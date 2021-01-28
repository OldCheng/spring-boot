package com.example.introduction.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 程杰
 * @Date 2021/1/4 14:32
 * @Version 1.0
 */
@RestController
@RequestMapping("/security")
public class SecurityController {

    @RequestMapping("/index")
    public String index(){
        return "security-----------index";
    }
}
