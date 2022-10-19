package com.example.sendersms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SenderSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SenderSmsApplication.class, args);
    }

}
