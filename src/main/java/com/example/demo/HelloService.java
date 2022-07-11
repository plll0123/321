package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String newHello() {
        return "service() called By HelloController.hello()";
    }
}
