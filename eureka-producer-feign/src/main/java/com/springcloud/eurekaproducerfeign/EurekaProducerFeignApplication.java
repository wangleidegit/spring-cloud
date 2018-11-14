package com.springcloud.eurekaproducerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class EurekaProducerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerFeignApplication.class, args);
    }
}
