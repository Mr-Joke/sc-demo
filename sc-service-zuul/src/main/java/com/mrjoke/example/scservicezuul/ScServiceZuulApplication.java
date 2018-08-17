package com.mrjoke.example.scservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ScServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScServiceZuulApplication.class, args);
    }
}
