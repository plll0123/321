package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    HelloService service;
    @RequestMapping
    public String hello123() {
        return "helloworld";
    }

    private String testPrivateMehotd() {
     return "tesT";
    }
    @RequestMapping
    public String controllerhello() {
        return service.newHello() + hello123();
    }
}
