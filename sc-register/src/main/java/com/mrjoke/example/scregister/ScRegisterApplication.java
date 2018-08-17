package com.mrjoke.example.scregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScRegisterApplication.class, args);
    }
}
