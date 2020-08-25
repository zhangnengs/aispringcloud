package com.zn.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 张能
 * @Date 2020/8/25 11:41
 * @Version 1.0
 */
@Data
@Repository
public class Student {
    private Long id;
    private String name;
    private int age;
}
