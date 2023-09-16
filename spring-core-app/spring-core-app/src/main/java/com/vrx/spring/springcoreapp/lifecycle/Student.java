package com.vrx.spring.springcoreapp.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student {

    public Student(){
        System.out.println("Creating Student...");
    }

    @PostConstruct
    public void created(){
        System.out.println("Student bean is created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bye Student.....");
    }
}
