package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 程杰
 * @Date 2020/12/29 16:40
 * @Version 1.0
 */
@Controller
public class DemoController {

    @RequestMapping("/test")
    public String test(){
        System.out.println(1111111111);
        return "helloWorld";
    }
}
