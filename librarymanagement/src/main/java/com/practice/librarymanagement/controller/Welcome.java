package com.practice.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @Value("${spring.message}")
    private String message;
    @GetMapping("/hi")
    public String getMessage(){
        return this.message;
    }
}

