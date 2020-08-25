package com.zn.service;

import com.zn.entity.Student;

import java.util.Collection;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author 张能
 * @Date 2020/8/24 17:39
 * @Version 1.0
 */
public interface StudentService {
    public Collection<Student> findAll();

    public Student findById(Long id);

    public void saveOrUpdate(Student student);

    public void deleteById(Long id);
}
