package com.example.helloworld.controller;
//This file listens for HTTP requests and returns a response.
//example.com/ will return "Hello World!"

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
