package com.mrjoke.example.scserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScServerApplication.class, args);
    }
}
