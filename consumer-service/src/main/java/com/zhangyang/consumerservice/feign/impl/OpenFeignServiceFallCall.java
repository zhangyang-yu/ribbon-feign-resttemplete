package com.zhangyang.consumerservice.feign.impl;

import com.zhangyang.consumerservice.feign.OpenFeignService;
import org.springframework.stereotype.Service;

@Service
public class OpenFeignServiceFallCall implements OpenFeignService {
    @Override
    public String getString() {
        return "张阳不帅";
    }
}
