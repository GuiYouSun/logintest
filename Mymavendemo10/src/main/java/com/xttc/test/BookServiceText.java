package com.xttc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xttc.pojo.Book;
import com.xttc.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml", "classpath:application-dao.xml"})
public class BookServiceText {
	@Autowired
	public BookService bookService;
	
	@Test
	public void findBookById() {
		Book book = bookService.findBookById(1);
		System.out.println("ͼ��id��" + book.getId());
		System.out.println("ͼ�����ƣ�" + book.getName());
		System.out.println("���ߣ�" + book. getAuthor());
		System.out.println("�����磺" + book. getPress());

	}
	
	

}
