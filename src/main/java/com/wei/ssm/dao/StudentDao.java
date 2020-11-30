package com.wei.ssm.dao;

import com.wei.ssm.model.Student;
import org.apache.ibatis.annotations.Param;

import javax.swing.text.Style;

public interface StudentDao {

    Student queryStudentById(@Param("id") String id);
}
