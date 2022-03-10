package com.sanjay.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.sanjay.handeler.CustomLoginFailureHandler;
import com.sanjay.handeler.CustomLoginSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
    private static final AuthenticationFailureHandler CustomLoginFailureHandler = null;

	private static final AuthenticationSuccessHandler CustomLoginSuccessHandler = null;

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/login").permitAll()
            .anyRequest().authenticated().and()
            .formLogin()
                .loginPage("/login")
                .usernameParameter("email")
                .failureHandler(CustomLoginFailureHandler)
                .successHandler(CustomLoginSuccessHandler)               
                .permitAll();
    }
     
    @Autowired
    private CustomLoginFailureHandler loginFailureHandler;
     
    @Autowired
    private CustomLoginSuccessHandler loginSuccessHandler;
}