package com.xttc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xttc.dao.BookMapper;
import com.xttc.dao.StudentMapper;
import com.xttc.pojo.Book;
import com.xttc.pojo.Student;
import com.xttc.service.BookService;
import com.xttc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentMapper stuMapper;
	
	

	public List<Student> findAll() {
		
		return stuMapper.findAll();
	}



	public int addStudent(Student stu) {
		
		return stuMapper.addStudent(stu);
	}

}
