package com.example.introduction.module.controller;

import com.example.introduction.module.entity.User;
import com.example.introduction.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
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
        return "HelloWorld";
    }

    @RequestMapping("/query")
    public String query() {

        String sql = "select * from home_tab_info";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);

        return "HelloWorld";
    }

    @RequestMapping("/user")
    public String user() {
        User user = new User();
        user.setId(123L);
        user.setUserName("lisi");
        user.setNote("dmj");
        userService.printUser(user);

        return "HelloWorld";
    }



}
