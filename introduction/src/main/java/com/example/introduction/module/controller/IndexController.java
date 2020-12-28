package com.example.introduction.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 程杰
 * @Date 2020/12/28 18:04
 * @Version 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "HelloWorld";
    }
}
