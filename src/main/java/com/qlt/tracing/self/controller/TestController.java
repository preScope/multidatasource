package com.qlt.tracing.self.controller;

import com.qlt.tracing.self.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class TestController {

    @Autowired
    TestMapper testMapper;


    @RequestMapping(value = "getAll")
    public int getAll(){
        Integer integer = testMapper.countAll();
        return integer;
    }



}
