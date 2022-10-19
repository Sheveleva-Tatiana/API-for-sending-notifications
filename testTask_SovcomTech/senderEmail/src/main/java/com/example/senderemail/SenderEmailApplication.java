package com.example.senderemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SenderEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SenderEmailApplication.class, args);
    }

}
