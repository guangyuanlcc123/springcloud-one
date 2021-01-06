package com.xiaostudy.web.controller;

import com.xiaostudy.server.client.TestServicesApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestWebController {

    @Value("${aa.bb}")
    private String value;

    @Autowired
    private TestServicesApis testServicesApis;

    @RequestMapping("/getTest")
    public String getTest() {
        return testServicesApis.get("通过web调用的");
    }

    @RequestMapping("value")
    public String getValue(){
        return "value: " + value;
    }
}
