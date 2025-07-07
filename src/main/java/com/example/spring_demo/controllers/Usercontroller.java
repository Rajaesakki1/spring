package com.example.spring_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class Usercontroller {
    @GetMapping
    public String getuser(){
        return "Hello ";
    }


}
