package com.module.controller;

import com.module.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //通过RPC调用接口服务，关闭检查
    @Reference(version = "1.0.0",check=false)
    private HelloService helloService;

    @GetMapping("/usr/{msg}")
    public String msg(@PathVariable String msg){
        return  helloService.say(msg);
    }
}
