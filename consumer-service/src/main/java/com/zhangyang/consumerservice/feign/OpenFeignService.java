package com.zhangyang.consumerservice.feign;

import com.zhangyang.consumerservice.feign.impl.OpenFeignServiceFallCall;
import com.zhangyang.feignclient.ProviderServiceFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-service",fallback = OpenFeignServiceFallCall.class)
public interface OpenFeignService extends ProviderServiceFeign {

}
