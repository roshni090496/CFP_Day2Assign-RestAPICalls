package com.example.day2assignrestapicalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestApi {
    @RequestMapping("/hello")
    // UC1
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
}
