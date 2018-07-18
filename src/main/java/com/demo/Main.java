package com.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        hw.getMessage();
//        new Main().myService.multi(1,2);
        context.registerShutdownHook();
    }




}
