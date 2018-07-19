package com.demo;

public class Logging {

    public void before() {
        System.out.println("before...");
    }

    public void after() {
        System.out.println("after...");
    }

    public void afterReturn(Object retVal) {
        System.out.println("Return :" + retVal.toString());
    }

    public void afterThrowing(Exception e) {
        System.out.println("Catch Exceptions :" + e);
    }
}
