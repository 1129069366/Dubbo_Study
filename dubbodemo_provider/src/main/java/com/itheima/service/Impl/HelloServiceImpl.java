package com.itheima.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;

/**
 * @program: dubble_demo
 * @description
 * @author: Mr.Yang
 * @create: 2021-06-18 22:45
 **/
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
