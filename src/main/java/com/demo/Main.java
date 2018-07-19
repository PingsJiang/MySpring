package com.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws Exception {

//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        context.start();
//        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
//        hw.getMessage();
//        context.registerShutdownHook();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.throwException();

    }




}
