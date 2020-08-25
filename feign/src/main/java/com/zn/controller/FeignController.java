package com.zn.controller;

import com.zn.entity.Student;
import com.zn.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @ClassName FeignController
 * @Description TODO
 * @Author 张能
 * @Date 2020/8/25 11:47
 * @Version 1.0
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
