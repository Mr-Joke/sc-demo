package com.mrjoke.example.scservicefeign.service.impl;

import com.mrjoke.example.scservicefeign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * project：sc-demo
 * class：FeignServiceFallback
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/17 14:26
 */
@Component
public class FeignServiceFallback implements FeignService {
    @Override
    public String hello(String name) {
        return "hello," + name + ";sorry,error";
    }
}
