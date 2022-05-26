package com.xttc.dao;

import java.util.List;

import com.xttc.pojo.Book;
import com.xttc.pojo.Student;

public interface StudentMapper {
	

	public List<Student> findAll();

	public int addStudent(Student stu);

}
