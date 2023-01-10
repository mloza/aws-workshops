package com.example.awsworkshop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAwesomeApplication {

    @Value("${whos.awesome}")
    private String whosAwesome;

    @GetMapping("/")
    public String getDefaultPage() {
        return "<h1>Who's awesome? " + whosAwesome + "</h1>";
    }

}
