package com.mrjoke.example.scservicezipkinclient.controller;

import com.mrjoke.example.scservicezipkinclient.service.HelloZipkinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project：sc-demo
 * class：HelloZipkinController
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/30 15:43
 */
@RestController
public class HelloZipkinController {
    private static Logger logger = LoggerFactory.getLogger(HelloZipkinController.class);
    @Autowired
    private HelloZipkinService helloZipkinService;

    @GetMapping("/hello")
    public String hello(String name){
        logger.info("zipkin hello : " + name);
        return helloZipkinService.hello(name);
    }

    @GetMapping("/hi")
    public String hi(){
        logger.info("zipkin hi");
        return "zipkin hi";
    }
}
