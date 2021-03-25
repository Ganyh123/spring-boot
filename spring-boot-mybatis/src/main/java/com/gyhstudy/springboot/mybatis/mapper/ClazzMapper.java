package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Clazz;

public interface ClazzMapper {
      /**
       * 一对多查询班级，并查找班级的学生
       * @param clazzId
       * @return clazz
       */
      Clazz getStudentsOneToMany(int clazzId);

      /**
       * 查询班级id对应的班级，并同时查出老师和班上的学生
       * @param clazzId
       * @return  Clazz
       */
      Clazz getStudentAndTeacher(int clazzId);
}