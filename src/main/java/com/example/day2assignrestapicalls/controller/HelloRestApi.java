package com.example.day2assignrestapicalls.controller;

import com.example.day2assignrestapicalls.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloRestApi {
    @RequestMapping("/hello")
    // UC1
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
    // UC2
    @RequestMapping ("/query/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    //UC3
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam(@RequestParam(value = "name") String name)
    {
        return "Hello " + name + "!";
    }
    //UC4
    @PostMapping("/post")
    public String sayHellopost(@RequestBody User user)
    {
        return "Hello " + user.getFirstName() + " "+  user.getLastName() + "!";
    }
    //UC5
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
