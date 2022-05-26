package com.xttc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xttc.pojo.Book;
import com.xttc.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	@RequestMapping("/book")
	public ModelAndView findBookById(Integer id) {
		System.out.println("123446");
		Book book = bookService.findBookById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("book.jsp");
		modelAndView.addObject("book",book);
		System.out.println(book);
		
		return modelAndView;
	}
	
	
	

}
