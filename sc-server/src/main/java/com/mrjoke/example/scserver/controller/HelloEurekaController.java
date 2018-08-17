package com.mrjoke.example.scserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project：sc-demo
 * class：HelloEurekaController
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/16 15:04
 */
@RestController
public class HelloEurekaController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(String name){
        return "hello," + name + ";port:" + port;
    }
}
