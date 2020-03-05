package com.example.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 张齐 on 2020/3/5 15:53
 */
//@SpringBootApplication
@EnableZuulProxy
@SpringCloudApplication
public class SpringcloudzuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudzuulApplication.class, args);
    }
}
