package com.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public Integer multi(Integer a, Integer b) {
        return a * b;
    }
}
