package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Clazz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void getStudentsOneToMany() {
        Clazz clazz = clazzMapper.getStudentsOneToMany(1);
        System.out.println(clazz);
        assertEquals("软件1911", clazz.getClazzName());
        assertEquals(1,clazz.getClazzId());
        assertEquals(3,clazz.getStudents().size());

        clazz.getStudents().forEach(student -> System.out.println(student.getStudentName() + student.getBirthday()));
    }
    @Test
    void  getStudentAndTeacher(){
        Clazz clazz = clazzMapper.getStudentAndTeacher(1);
        System.out.println(clazz.getClazzId()+" "+clazz.getClazzName());
        System.out.println(clazz.getTeacher().getTeacherId()+" "+clazz.getTeacher().getTeacherName());
        clazz.getStudents().forEach(student -> System.out.println(student.getStudentId()+" "+student.getStudentName()+
                " "+student.getHometown()+" "+student.getBirthday()));
        System.out.println("      ");
    }
}