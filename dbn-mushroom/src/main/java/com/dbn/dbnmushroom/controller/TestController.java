package com.dbn.dbnmushroom.controller;

import com.dbn.dbnmushroom.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    TestMapper testMapper;

    @RequestMapping("getMessage")
    public String getMessage() {
        return testMapper.getMessage();
    }
}
