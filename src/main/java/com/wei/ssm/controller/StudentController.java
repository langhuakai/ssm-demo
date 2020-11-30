package com.wei.ssm.controller;

import com.wei.ssm.model.Student;
import com.wei.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/get",produces = "application/json;charset=utf-8")
    @ResponseBody
    public Student getStudent(String id) {
        return studentService.queryStudentById(id);
    }

    @RequestMapping("/query")
    @ResponseBody
    public String getStudent2(String id) {
        return "new Student()";
    }
}
