package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Teacher;import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    /**
     * 返回所有的Teacher
     *
     * @return Teacher
     */
    List<Teacher> selectAll();

    /**
     * 增加老师
     *
     * @param teacher
     */
    void insertTeacher(Teacher teacher);
}