package com.xttc.dao;

import java.util.List;

import com.xttc.pojo.Book;

public interface BookMapper {
	
	public Book findBookById(Integer id);

	public List<Book> findAll();

}
