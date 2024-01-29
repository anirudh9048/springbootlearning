package com.aka.jst;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;

import java.io.*;
import java.util.Arrays;

@SpringBootApplication
@ComponentScan
public class Main {

    @Autowired
    Runner r;


    public static void main(String[] args) {
        System.out.println("Starting...");
        SpringApplication.run(Main.class, args);
    }

//    @EventListener
//    private void start(ApplicationStartedEvent ase) {
//        System.out.println("App started");
//    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

        return args -> {
//            r.run();
              r.test();
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
        };
    }
}
