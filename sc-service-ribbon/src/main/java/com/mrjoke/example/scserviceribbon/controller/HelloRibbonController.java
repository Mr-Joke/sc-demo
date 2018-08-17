package com.mrjoke.example.scserviceribbon.controller;

import com.mrjoke.example.scserviceribbon.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project：sc-demo
 * class：HelloRibbonController
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/16 16:08
 */
@RestController
public class HelloRibbonController {
    @Autowired
    private HelloRibbonService helloRibbonService;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloRibbonService.hello(name);
    }
}
