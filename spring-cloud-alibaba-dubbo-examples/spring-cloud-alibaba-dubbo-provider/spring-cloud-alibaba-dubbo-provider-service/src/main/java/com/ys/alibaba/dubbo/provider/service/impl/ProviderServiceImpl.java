package com.ys.alibaba.dubbo.provider.service.impl;

import com.ys.alibaba.dubbo.provider.service.ProviderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String hi() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "this is hi spring cloud alibaba dubbo provider";
    }
}
