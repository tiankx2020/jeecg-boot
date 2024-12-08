package com.tkx.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @Author tkx
 * @Date 2024 12 07 21 11
 **/
@Service
public class UserServiceImpl implements UserService{
    @Override
    public String sayHello() {
        return "hello,dubbo";
    }
}
