//package com.example.introduction.module.controller;
//
//import com.alibaba.nacos.api.config.annotation.NacosValue;
//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import static org.springframework.web.bind.annotation.RequestMethod.GET;
//
///**
// * @Description
// * @Author 程杰
// * @Date 2020/11/28 17:34
// * @Version 1.0
// */
//@Component
//@NacosPropertySource(dataId = "product2.yml", groupId = "test" ,autoRefreshed = true)
//@RestController
//@RequestMapping("/demo")
//public class DemoController {
//
//    @Autowired
//    private ConfigurableApplicationContext configurableApplicationContext;
//
//    @NacosValue(value = "${captcha.version:s2}", autoRefreshed = true)
//    private String version;
//
//
//    @RequestMapping(value = "/get", method = GET)
//    @ResponseBody
//    public String get() {
//        String startTime = configurableApplicationContext.getEnvironment().getProperty("captcha.version");
//        return "hello world   2";
//    }
//}
