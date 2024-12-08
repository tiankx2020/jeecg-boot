package com.tkx.service;

import com.tkx.pojo.User;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author tkx
 * @Date 2024 12 07 21 11
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User query(Integer id) {
        System.out.println("服务被调用了");
        User user = new User(1, "tkx", "123");
        return user;
    }

    @Override
    public String sayHello() {
        return "hello,dubbo";
    }
}
