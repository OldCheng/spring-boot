package com.example.introduction.module.test;

import com.alibaba.nacos.client.logger.json.JSONObject;
import com.example.introduction.config.RedisConfig;
import com.example.introduction.module.entity.User;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author 程杰
 * @Date 2020/12/31 15:02
 * @Version 1.0
 */
public class TestRedis {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1L);
        user.setUserName("ZHANGSAN");
        user.setNote("1234");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisTemplate redisTemplate = (RedisTemplate) applicationContext.getBean("redisTemplate");
        redisTemplate.opsForValue().set("testRedis", user.toString());
    }
}
