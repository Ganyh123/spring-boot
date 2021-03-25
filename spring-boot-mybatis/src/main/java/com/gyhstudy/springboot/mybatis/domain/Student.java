package com.gyhstudy.springboot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 班级名称
     */
    private Integer clazzId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生籍贯
     */
    private String hometown;

    /**
     * 学生生日
     */
    private LocalDate birthday;

    /**
     * 一对多 班级查询学生信息
     */
    private Clazz clazz;

    /**
     * 多对多查询课程信息
     */
    private List<Course> course;
}