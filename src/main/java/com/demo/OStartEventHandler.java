package com.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

import java.sql.Timestamp;

public class OStartEventHandler implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        HelloWorld hw = (HelloWorld) contextStartedEvent.getApplicationContext().getBean("helloWorld");
        hw.getMessage();
        System.out.println("ContextStartedEvent");
    }
}
