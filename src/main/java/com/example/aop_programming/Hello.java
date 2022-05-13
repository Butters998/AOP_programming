package com.example.aop_programming;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    @EventListener(ApplicationReadyEvent.class)
    @HelloAnnotation
    public String Hello(){
        System.out.println("Hello");
        return "Hello";
    }
}
