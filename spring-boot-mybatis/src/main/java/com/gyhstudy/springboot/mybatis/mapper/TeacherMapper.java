package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Teacher;import java.util.List;

public interface TeacherMapper {
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
    /**
     * 查询老师管理的班级
     * @param   teacherId
     * @return Teacher
     */
    Teacher getClazzOneByOne(int teacherId);
}