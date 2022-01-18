package com.practice.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public Boolean isHealthy(){
        return true;
    }

    @GetMapping("/getMessage")
    public String getMessage(String message){
        return String.format("Hello %s", message);
    }
}
