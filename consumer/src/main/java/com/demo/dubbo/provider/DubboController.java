package com.demo.dubbo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return userService.buyTicket();
    }
}
