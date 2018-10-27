package com.example.project.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjectDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDemo01Application.class, args);
    }
}
