package com.demo;

public class HelloWorld {

    private String message;

    public void getMessage() {
        System.out.println("the message is: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void init() {
        System.out.println("Hello World Init !");
    }

    private void destroy() {
        System.out.println("Hello World Destroy !");
    }
}
