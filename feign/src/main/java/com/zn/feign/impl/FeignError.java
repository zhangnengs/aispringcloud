package com.zn.feign.impl;

import com.zn.entity.Student;
import com.zn.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @ClassName FeignError
 * @Description TODO
 * @Author 张能
 * @Date 2020/8/25 12:05
 * @Version 1.0
 */

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护中！！";
    }
}
