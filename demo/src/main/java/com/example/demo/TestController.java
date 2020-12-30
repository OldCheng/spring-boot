package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 程杰
 * @Date 2020/12/29 16:40
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/index")
    public String test(){
        return "helloWorld";
    }
}
