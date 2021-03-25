package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Course;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    void getCourseAndStudent() {
        Course course = courseMapper.getCourseAndStudent("前端框架技术");
        System.out.println(course);
    }
}