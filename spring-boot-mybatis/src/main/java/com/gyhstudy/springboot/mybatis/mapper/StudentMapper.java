package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Student;

public interface StudentMapper {
    /**
     * 根据id删除学生
     * @param studentId
     * @return int
     */
    int deleteByPrimaryKey(Integer studentId);

    /**
     * 根据id新增学生
     * @param student
     * @return int
     */
    int insert(Student student);

    /**
     * 根据id查询学生
     * @param studentId
     * @return student
     */
    Student selectByPrimaryKey(Integer studentId);

    /**
     * 根据id修改学生信息
     * @param student
     * @return int
     */
    int updateByPrimaryKeySelective(Student student);



}