package com.better517na.fangyuan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    
    @Value("$(server.port)" )
    private String ymlValue;

    @RequestMapping("/hi")
    public String index() {
        return "hello world!"+"2";
    }

}