package com.example.helloconsumer.helloconsumer;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 张齐 on 2020/3/5 9:41
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloconsumer(){
        return  restTemplate.getForEntity("http://HELLO-SERVICE/nihao",String.class).getBody();
    }

    public String helloFallback(){

        return "哎呀，出错啦！！";
    }
}
