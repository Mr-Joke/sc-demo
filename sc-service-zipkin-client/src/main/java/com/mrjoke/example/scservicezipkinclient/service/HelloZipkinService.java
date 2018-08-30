package com.mrjoke.example.scservicezipkinclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * project：sc-demo
 * class：HelloZipkinService
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/30 15:47
 */
@FeignClient("service-feign")
@Service
public interface HelloZipkinService {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
