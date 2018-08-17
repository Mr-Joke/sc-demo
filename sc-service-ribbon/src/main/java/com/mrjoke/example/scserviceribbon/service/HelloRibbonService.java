package com.mrjoke.example.scserviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * project：sc-demo
 * class：HelloRibbonService
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/16 16:10
 */
@Service
public class HelloRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name) {
        return restTemplate.getForObject("http://EUREKA-SERVER/eureka-server/hello?name=" + name,String.class);
    }

    public String helloError(String name){
        return "hello," + name + ",sorry,error";
    }
}
