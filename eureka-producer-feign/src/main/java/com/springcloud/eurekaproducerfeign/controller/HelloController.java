package com.springcloud.eurekaproducerfeign.controller;

import com.springcloud.eurekaproducerfeign.handler.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name + "!");
    }

    @GetMapping("/post/{name}")
    public String postMethod(@PathVariable("name") String name){
        Person person = new Person();
        person.setId(1);
        person.setPwd("123456");
        person.setName(name);
        return helloRemote.postMethod(person);
    }

}