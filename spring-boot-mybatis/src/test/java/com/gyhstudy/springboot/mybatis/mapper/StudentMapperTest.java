package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.time.LocalDate;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;
//    @Test
//    void deleteByPrimaryKey() {
//        Student student =Student.builder().studentId(1).build();
//        studentMapper.deleteByPrimaryKey(student.getStudentId());
//    }

    @Test
    void insert() {
        Student student = Student.builder().clazzId(1).studentName("小王")
                .hometown("香港")
                .birthday(LocalDate.of(1999, 10, 10))
                .build();
        studentMapper.insert(student);
    }

    @Test
    void selectByPrimaryKey() {
       Student student =studentMapper.selectByPrimaryKey(2);
        System.out.println(student);

    }

    @Test
    void updateByPrimaryKeySelective() {
        Student student = Student.builder()
                .studentId(4)
                .studentName("小虎")
                .clazzId(1)
                .hometown("澳门")
                .birthday(LocalDate.of(2001,9,10)).build();
        studentMapper.updateByPrimaryKeySelective(student);
    }
}