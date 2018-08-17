package com.mrjoke.example.scservicefeign.service;

import com.mrjoke.example.scservicefeign.service.impl.FeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * project：sc-demo
 * class：FeignService
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/16 16:41
 */
@FeignClient(value = "eureka-server",fallback = FeignServiceFallback.class)
@Component
public interface FeignService {

    @GetMapping("/eureka-server/hello")
    String hello(@RequestParam("name") String name);
}
