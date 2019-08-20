package com.better517na.fangyuan.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "config-client-test")
public interface ITestFeign {
    @RequestMapping("/hi")
    String index() ;
}
