package com.example.feignconsumer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 张齐 on 2020/3/5 10:16
 */
@FeignClient(name = "hello-service")
public interface HelloService {
    @RequestMapping(value = "/nihao",method = RequestMethod.GET)
    String he();

}
