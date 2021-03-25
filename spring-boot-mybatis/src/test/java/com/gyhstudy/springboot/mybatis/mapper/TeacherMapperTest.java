package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.List;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void selectAll() {
        List<Teacher> teachers = teacherMapper.selectAll();
        System.out.println(teachers);
    }
    @Test
    void insertTeacher(){
        Teacher teacher = Teacher.builder().teacherName("吴老师").clazzId(2).build();
        teacherMapper.insertTeacher(teacher);
    }
    @Test
    void getClazzOneByOne(){
        Teacher teacher = teacherMapper.getClazzOneByOne(1);
        System.out.println(teacher);
    }

}