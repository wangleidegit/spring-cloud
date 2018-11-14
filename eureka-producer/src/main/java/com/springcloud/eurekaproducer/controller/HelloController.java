package com.springcloud.eurekaproducer.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + " " + new Date();
    }

    @PostMapping("/post")
    public String post(@RequestBody Person person){
        return "Hello, " + person.getName() + " " + new Date();
    }

}