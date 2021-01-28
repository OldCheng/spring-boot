package com.example.introduction.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @Author 程杰
 * @Date 2021/1/4 14:58
 * @Version 1.0
 */
@Configuration
public class MySecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("admin")
                //passwordEncoder.encode("abc")
                .password(passwordEncoder.encode("abc"))
                .roles("user","admin")
                .and()
                .withUser("myuser")
                // passwordEncoder.encode("123456") 加密
                .password(passwordEncoder.encode("123456"))
                .roles("user");
    }

}
