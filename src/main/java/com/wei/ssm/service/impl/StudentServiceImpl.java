package com.wei.ssm.service.impl;

import com.wei.ssm.dao.StudentDao;
import com.wei.ssm.model.Student;
import com.wei.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public Student queryStudentById(String id) {
        return studentDao.queryStudentById(id);
    }
}
