package org.crux.module.exam.service;

import org.crux.module.exam.dao.StudentDao;
import org.crux.module.exam.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shenqingwen
 * @date 2020/9/16
 **/
@Service
public class StudentService {

    @Resource
    StudentDao studentDao;

    public Student selectStudent(String name) {
        return studentDao.selectStudent(name);
    }

    public List<Student> listStudent() {
        return studentDao.listStudent();
    }
}
