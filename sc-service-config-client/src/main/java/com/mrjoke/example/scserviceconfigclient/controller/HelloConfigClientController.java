package com.mrjoke.example.scserviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: sc-demo
 * Author: Mrzhou
 * Date: 2018/8/18 14:49
 **/
@RestController
@RefreshScope
public class HelloConfigClientController {
    @Value("${mrjoke}")
    private String mrjoke;

    @GetMapping("/hello")
    public String hello(){
        return "config name :" + mrjoke;
    }
}
