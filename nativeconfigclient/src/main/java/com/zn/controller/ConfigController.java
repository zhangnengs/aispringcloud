package com.zn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author 张能
 * @Date 2020/8/25 14:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/native")
public class ConfigController {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return this.port+"----"+this.foo;
    }
}
