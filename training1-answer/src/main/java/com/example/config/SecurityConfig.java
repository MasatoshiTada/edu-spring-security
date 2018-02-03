package com.example.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // BASIC認証を無効化する場合は、下記の処理をすべてコメントアウトする
        http.httpBasic();
        http.authorizeRequests()
                .anyRequest().authenticated();
    }

}
