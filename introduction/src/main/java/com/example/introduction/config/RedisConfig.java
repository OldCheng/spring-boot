package com.example.introduction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author 程杰
 * @Date 2020/12/31 14:11
 * @Version 1.0
 */
@Configuration
public class RedisConfig {

    private RedisConnectionFactory redisConnectionFactory;

    @Bean
    public RedisConnectionFactory initRedisConnectionFactory(){
        if(redisConnectionFactory != null){
            return this.redisConnectionFactory;
        }
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        //最大空闲数
        poolConfig.setMaxIdle(30);
        //最大连接数
        poolConfig.setMaxTotal(50);
        //最大等待毫秒数
        poolConfig.setMaxWaitMillis(2000);

        //创建jedis连接工厂
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
        RedisStandaloneConfiguration standaloneConfiguration = jedisConnectionFactory.getStandaloneConfiguration();
        standaloneConfiguration.setHostName("192.168.42.128");
        standaloneConfiguration.setPort(6379);
        return this.redisConnectionFactory = jedisConnectionFactory;
    }
    @Bean(name="redisTemplate")
    public RedisTemplate<Object , Object> initRedisTemplate () {
        RedisTemplate<Object , Object> redisTemplate =new RedisTemplate<>( );
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //值的序列化方式
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setConnectionFactory(initRedisConnectionFactory()) ;
        return redisTemplate ;
    }

}
