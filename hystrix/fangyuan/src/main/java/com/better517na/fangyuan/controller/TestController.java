package com.better517na.fangyuan.controller;

import com.better517na.fangyuan.feign.ITestFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TestController {
    @Autowired
    private ITestFeign testFeign;



    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/hi")
    public String index() {
        return testFeign.index();
    }

    public String fallback(){
        return "error";
    }

    
}