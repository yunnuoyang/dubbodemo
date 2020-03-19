package com.module.service.impl;

import com.module.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0",interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String say(String word) {
        return "node1 say:"+word;
    }
}
