package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Course;

public interface CourseMapper {
    /**
     * 查询该课程下的学生信息
     * @param coursename
     * @return
     */
    Course getCourseAndStudent(String coursename);
}