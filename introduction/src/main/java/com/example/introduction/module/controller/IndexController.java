package com.example.introduction.module.controller;

import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author 程杰
 * @Date 2020/12/28 18:04
 * @Version 1.0
 */
@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/index")
    public String index() {
        return "index------HelloWorld";
    }

    @RequestMapping("/query")
    public String query() {

        String sql = "select * from student";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println("--------query-----");
        return "query------HelloWorld";
    }

    @RequestMapping("/user")
    public String user() {
        User user = new User();
        user.setId(123L);
        user.setUserName("lisi");
        user.setNote("dmj");
        userService.printUser(user);

        return "user------HelloWorld";
    }

    @RequestMapping("/getUser")
    public User getUser() {


        return userService.getUser();
    }



}
