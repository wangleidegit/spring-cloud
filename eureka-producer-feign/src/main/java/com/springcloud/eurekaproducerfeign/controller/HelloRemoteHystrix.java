package com.springcloud.eurekaproducerfeign.controller;

import com.springcloud.eurekaproducerfeign.handler.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello World!";
    }

    @Override
    public String postMethod(Person person) {
        return "Hello World!";
    }

}