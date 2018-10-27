package com.example.project.module02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjectModule02Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectModule02Application.class, args);
    }
}
