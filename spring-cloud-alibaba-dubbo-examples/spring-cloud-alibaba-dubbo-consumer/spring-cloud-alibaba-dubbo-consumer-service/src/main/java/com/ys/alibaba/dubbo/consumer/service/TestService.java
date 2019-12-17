package com.ys.alibaba.dubbo.consumer.service;

import com.ys.alibaba.dubbo.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

    @Autowired
    ProviderService providerService;

    @GetMapping("/test")
    public String test(){
        try {
            Thread.sleep(8000);
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return providerService.hi();
    }

}
