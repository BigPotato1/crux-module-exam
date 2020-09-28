package org.crux.module.exam.dao;

import org.crux.module.exam.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shenqingwen
 * Date: 2020/9/10
 */
@Repository
public interface StudentDao {

    int getTotal();

    void addStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);

    Student selectStudent(String name);

    List<Student> listStudent();

}
