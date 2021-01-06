package com.xiaostudy.server.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "server-service", contextId = "TestServicesApis")
public interface TestServicesApis {

    @RequestMapping("/test/get")
    public String get(@RequestParam("name") String name);
}