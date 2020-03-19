package com;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务提供者切记@EnableDubbo注解
 */
@EnableDubbo
@SpringBootApplication
public class ProviderNode1Stater {
    public static void main(String[] args) {
        SpringApplication.run(ProviderNode1Stater.class);
    }
}
