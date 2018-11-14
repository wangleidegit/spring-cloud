package com.springcloud.eurekaproducerfeign.handler;

import com.springcloud.eurekaproducerfeign.controller.HelloRemoteHystrix;
import com.springcloud.eurekaproducerfeign.controller.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

    @PostMapping("/hello/post")
    String postMethod(@RequestBody Person person);


}