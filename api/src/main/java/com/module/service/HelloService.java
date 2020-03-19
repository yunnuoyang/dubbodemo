package com.module.service;

/**
 * 抽离出API服务接口的好处
 * 1.一个module，多处复用
 * 2.在消费者调用时保证了服务接口路径的正确性
 */
public interface HelloService {
    String say(String word);
}
