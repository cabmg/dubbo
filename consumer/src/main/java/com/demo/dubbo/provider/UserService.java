package com.demo.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.DemoService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    DemoService demoService;
    public String buyTicket(){
        return demoService.msg();
    }
}
