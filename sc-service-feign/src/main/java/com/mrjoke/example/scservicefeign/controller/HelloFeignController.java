package com.mrjoke.example.scservicefeign.controller;

import com.mrjoke.example.scservicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project：sc-demo
 * class：HelloFeignController
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/16 16:39
 */
@RestController
public class HelloFeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/hello")
    public String hello(String name){
        return feignService.hello(name);
    }
}
