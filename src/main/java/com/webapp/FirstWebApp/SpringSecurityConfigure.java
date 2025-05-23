package com.webapp.FirstWebApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.function.Function;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfigure {
    @Bean
    public InMemoryUserDetailsManager CreateUser(){

        Function<String, String> PasswordEncoder=input-> passwordEncoder().encode(input);
        UserDetails userDetails= User.builder()
                .passwordEncoder(PasswordEncoder)
                .username("atul")
                .password("admin")
                .roles("USER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
    // to make custom encoder     //
    @Bean
    public PasswordEncoder passwordEncoder (){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws  Exception{
        httpSecurity.authorizeHttpRequests(
                auth-> auth.anyRequest().authenticated());
        httpSecurity.formLogin(withDefaults());
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
        return httpSecurity.build();
    }
}
