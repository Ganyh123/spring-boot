package com.gyhstudy.springboot.mybatis.mapper;

import com.gyhstudy.springboot.mybatis.domain.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;
    @Test
    void deleteByPrimaryKey() {
        Student student =Student.builder().studentId(3).build();
        studentMapper.deleteByPrimaryKey(student.getStudentId());
    }

    @Test
    void insert() {
        Student student = Student.builder().clazzId(1).studentName("小王")
                .hometown("北京")
                .birthday(LocalDate.of(1999, 10, 10))
                .build();
        studentMapper.insert(student);
    }

    @Test
    void selectByPrimaryKey() {
       Student student =studentMapper.selectByPrimaryKey(4);
        System.out.println(student);

    }

    @Test
    void updateByPrimaryKeySelective() {
        Student student = Student.builder()
                .studentId(5)
                .studentName("小虎")
                .clazzId(1)
                .hometown("黑龙江")
                .birthday(LocalDate.of(2003,9,10)).build();
        studentMapper.updateByPrimaryKeySelective(student);
    }

    @Test
    void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(10 + i)
                    .clazzId(1)
                    .studentName("测试学生" + i)
                    .hometown("测试城市")
                    .birthday(LocalDate.of(1997, 10, 10))
                    .build();
            students.add(student);
        }
        studentMapper.batchInsert(students);
    }


    @Test
    void batchUpdate() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(10 + i)
                    .clazzId(1)
                    .studentName("新名字" + i)
                    .build();
            students.add(student);
        }
        int n = studentMapper.batchUpdate(students);
        assertEquals(1, n);
    }

    @Test
    void batchDelete() {
        List<Integer> idList = new ArrayList<>();
        idList.add(6);
        idList.add(7);
        idList.add(8);
        studentMapper.batchDelete(idList);
    }

    @Test
    void selectByDynamicSql() {
        Student student = Student.builder().hometown("江").build();
        List<Student> students = studentMapper.selectByDynamicSql(student);
        System.out.println(students);
    }

    @Test
    void getClazzManyToOne(){
        Student student = studentMapper.getClazzManyToOne(2);
//        System.out.println(student);
        System.out.println(student.getClazz().getClazzId()+student.getClazz().getClazzName());
    }

    @Test
    void getStudentAll(){
        Student studentALl = studentMapper.getStudentALl(5);
        System.out.println(studentALl);
        System.out.println("班级号:"+studentALl.getClazz().getClazzId()+"  班级名称:"+studentALl.getClazz().getClazzName());
        System.out.println("ID:"+studentALl.getStudentId()+"  姓名:"+studentALl.getStudentName()+"  生日:"+studentALl.getBirthday()+"  地址:"+studentALl.getHometown());
        studentALl.getCourse().forEach(course -> System.out.println("课程名称:"+course.getCourseName()+"  课程ID:"+course.getCourseId()));
    }
}