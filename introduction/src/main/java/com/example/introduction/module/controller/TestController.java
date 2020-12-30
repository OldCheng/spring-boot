//package com.example.introduction.module.controller;
//
//import com.alibaba.nacos.api.config.annotation.NacosValue;
//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import static org.springframework.web.bind.annotation.RequestMethod.GET;
//
///**
// * @Description
// * @Author 程杰
// * @Date 2020/11/25 19:30
// * @Version 1.0
// */
//@NacosPropertySource(dataId = "product.yml", groupId = "test" ,autoRefreshed = true)
//@RestController
//@RequestMapping("/test")
//public class TestController {
//
//
////
////    @Value("${captcha.verifyApiUrl:132asd}")
////    private String verifyApiUrl;
////    @Value("${say:132asd}")
////    private String say;
//
////    @Value("${new.person:q}")
////    private String people;
//
////    @Value("${create:q}")
////    private String sex;
//
//    //@NacosValue(value = "${create:s2}", autoRefreshed = true)
//    @Value("${create:s2}")
//    private String create;
//
//
//    @RequestMapping(value = "/get", method = GET)
//    @ResponseBody
//    public String get() {
//        return "hello world";
//    }
//
//}
