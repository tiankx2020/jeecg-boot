package org.jeecg.modules.health;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tkx
 * @Date 2024 11 24 12 45
 **/
@RestController
public class HealthCheck {


    @PostMapping("/health/check")
    public String check(){
        return "hello,world";
    }
}
