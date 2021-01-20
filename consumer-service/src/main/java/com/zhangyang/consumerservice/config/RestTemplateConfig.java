package com.zhangyang.consumerservice.config;

import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import feign.Retryer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    /**
     * 修改远程调用的负载均衡的策略
     * @return
     */
    @Bean
    public RandomRule randomRule()
    {
        return new   RandomRule();
    }

    @Bean
    public Retryer retryer()
    {
        return new  Retryer.Default();//使用默认的参数设置重试
    }

    @LoadBalanced //restTemplete可以实现远程调用 加ribbon注解实现负载均衡
    @Bean
    public RestTemplate restTemplate()

    {
        return  new RestTemplate();
    }
}
