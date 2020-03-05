package com.example.helloconsumer.helloconsumer;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张齐 on 2020/3/5 9:50
 */
@RestController
public class HelloController {

    @Autowired
    private  HelloService helloService;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public  String hello(){

        return helloService.helloconsumer();
    }
}
