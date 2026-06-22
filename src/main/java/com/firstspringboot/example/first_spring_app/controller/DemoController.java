package com.firstspringboot.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/d1")
    public String getDemo1(){
        return "This is demo1 API";
    }

    @GetMapping("/d2")
    public String getDemo2(){
        return "This is demo2 API";
    }
}
