package org.jeecg.modules.dubbo;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author tkx
 * @Date 2024 12 07 17 03
 **/
@DubboService
public class DubboProviderImpl implements DubboProviderInterface{
    @Override
    public String sayHello() {
        return "sayHello";
    }
}
