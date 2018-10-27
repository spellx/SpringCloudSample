package com.example.project.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo01")
public class Demo01Controller {

    @RequestMapping("/hello")
    public String hello() {
        return "Demo01Controller.hello()";
    }

}
