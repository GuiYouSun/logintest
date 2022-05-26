package com.xttc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xttc.dao.BookMapper;
import com.xttc.pojo.Book;
import com.xttc.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	public BookMapper bookMapper;
	
	public Book findBookById(Integer id) {
		 
		return bookMapper.findBookById(id);
	}


	 
}
