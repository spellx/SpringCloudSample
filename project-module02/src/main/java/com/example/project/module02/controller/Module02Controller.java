package com.example.project.module02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module02")
public class Module02Controller {

    @RequestMapping("/hello")
    public String hello() {
        return "Module02Controller.hello()";
    }

}
