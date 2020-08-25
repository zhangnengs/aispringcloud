package com.zn.service.impl;

import com.zn.entity.Student;
import com.zn.service.StudentService;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author 张能
 * @Date 2020/8/24 17:42
 * @Version 1.0
 */

@Repository
public class StudentServiceImpl implements StudentService {

    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",18));
        studentMap.put(2L,new Student(2L,"李四",19));
        studentMap.put(3L,new Student(3L,"王五",20));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
