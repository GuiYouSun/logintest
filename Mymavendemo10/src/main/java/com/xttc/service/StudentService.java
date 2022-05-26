package com.xttc.service;

import java.util.List;

import com.xttc.pojo.Student;

public interface StudentService {


	public List<Student> findAll();

	public int addStudent(Student stu);
}
