package com.xiaostudy.server.service.impl;

import com.xiaostudy.server.service.TestServices;
import org.springframework.stereotype.Service;

@Service
public class TestServicesImpl implements TestServices {

    @Override
    public String get(String name) {
        return "参数name：" + name;
    }
}
