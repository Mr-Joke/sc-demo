package com.mrjoke.example.scserviceconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScServiceConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScServiceConfigClientApplication.class, args);
	}
}
