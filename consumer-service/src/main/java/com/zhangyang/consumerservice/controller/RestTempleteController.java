package com.zhangyang.consumerservice.controller;

import com.zhangyang.consumerservice.feign.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Ribbon")
public class RestTempleteController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OpenFeignService openFeignService;
    @GetMapping("/restTemplete")
    public  String getTempleteValue()
    {
        String forObject = restTemplate.getForObject("http://provider-service/provider/getString", String.class);
        return forObject;
    }
    @GetMapping("/openFeign")
    public  String getFeignValue()
    {
        String string = openFeignService.getString();
        return string;
    }
}
