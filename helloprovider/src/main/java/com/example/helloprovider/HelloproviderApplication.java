package com.example.helloprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloproviderApplication.class, args);
    }

}
