package com.example.helloconsumer.helloconsumer;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 张齐 on 2020/2/20 17:36
 */
@RestController
public class Hello {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbonhello")
    public String helloconsumer(){


        return  restTemplate.getForEntity("http://HELLO-SERVICE/nihao",String.class).getBody();
    }

}
