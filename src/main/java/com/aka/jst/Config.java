package com.aka.jst;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Runner testRunner() {
        return new Runner();
    }
}
