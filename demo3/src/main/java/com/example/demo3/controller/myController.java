package com.example.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @GetMapping("/")
    public String sayHi(){
        return "Hello from myController";
    }

}
