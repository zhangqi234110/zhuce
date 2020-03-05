package com.example.helloprovider2.helloController;


import com.example.helloprovider2.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张齐 on 2020/2/20 17:28
 */
@RestController
public class Hello {

    @RequestMapping("/nihao")
    public User he(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setSex("男");
        user.setAge("11");
        return user;
    }

}
