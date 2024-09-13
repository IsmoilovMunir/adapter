package com.example.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdapterApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdapterApplication.class, args);
    }

}
