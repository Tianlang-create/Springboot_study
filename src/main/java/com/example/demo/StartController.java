package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @RequestMapping("/springboot")
    public static String startSpringBoot() {
        return "Welcome to Spring Boot,Made by Tianlang";
    }
}