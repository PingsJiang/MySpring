package com.demo;

public class Student {

    private String name;
    private int age;

    public String getName() {
        System.out.println("name:" + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("age:" + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void throwException() {
        System.out.println("throw exception");
        throw new IllegalArgumentException();
    }

}
