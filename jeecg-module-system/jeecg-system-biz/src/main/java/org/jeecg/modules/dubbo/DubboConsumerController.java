package org.jeecg.modules.dubbo;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tkx
 * @Date 2024 12 07 17 09
 **/
@RestController
@RequestMapping("/tkx")
public class DubboConsumerController {


    @Reference
    private DubboProviderInterface providerInterface;


    @GetMapping("/sayHello")
    public String sayHello(){
        return providerInterface.sayHello();
    }
}
