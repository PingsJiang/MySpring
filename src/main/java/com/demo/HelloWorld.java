package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

    @Autowired
    private Message message;

    @SuppressWarnings("unchecked")
    public void getMessage() {
        System.out.println("inner message");
    }

    @PostConstruct
    private void init() {
        System.out.println("Init HelloWorld");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Destroy HelloWorld");
    }


}
