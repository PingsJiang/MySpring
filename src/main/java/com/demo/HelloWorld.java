package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    private Message message;

    @SuppressWarnings("unchecked")
    public void getMessage() {
        System.out.println("inner message");
    }

    @Autowired
    @SuppressWarnings("unchecked")
    public void setMessage(Message message) {
        this.message = message;
    }
}
