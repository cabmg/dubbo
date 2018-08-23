package com.demo.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.DemoService;
import org.springframework.stereotype.Component;


@Service(timeout = 5000)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String msg() {
        return "DUBBO HELLO";
    }
}
