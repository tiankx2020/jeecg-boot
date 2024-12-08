package com.tkx.controller;

import com.tkx.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tkx
 * @Date 2024 12 07 21 26
 **/
@RestController
public class DubboController {

    @Reference
    private UserService userService;

    @GetMapping("/dubbo")
    public String dubbo(){
        return userService.sayHello();
    }

    @GetMapping("query")
    public String query(){
        return userService.query(1).toString();
    }
}
