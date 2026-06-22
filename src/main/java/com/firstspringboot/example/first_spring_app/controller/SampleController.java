package com.firstspringboot.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/s1")
    public String getSample1(){
        System.out.println("This is our first sample API - printing in server console");
        return "This is our first sample API - return to users";
    }

    @GetMapping("/s2")
    public String getSample2(){
        System.out.println("This is second sample API - printing in server console");
        return "This is second sample API - return to users";
    }
}
