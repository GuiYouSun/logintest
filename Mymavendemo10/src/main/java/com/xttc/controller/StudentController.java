package com.xttc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xttc.pojo.Book;
import com.xttc.pojo.Student;
import com.xttc.pojo.User;
import com.xttc.service.BookService;
import com.xttc.service.StudentService;

import com.xttc.controller.*;

@Controller
public class StudentController {
	
	@Autowired
	public StudentService stuService;
	//��ת��ϵͳ��ҳ
	@RequestMapping("/main")
	public String toMainPage() {
		return "main" ;
	}
	//��ת����¼ҳ��
	@RequestMapping( "/tologin")
	public String toLoginPage( ){
		return "login";
	}
	//��ת��������Ϣҳ��
	@RequestMapping( "orderinfo")
	public String orderinfo() {
		return "orderinfo" ;
	}
	/**
	 * �û���¼
	 */
	@RequestMapping(value = "/login" )
	public String login(User user,Model model , HttpSession session) {
		System.out.println("controller");
		//��ȡ�û���������
		String username = user.getUsername();
		String password = user.getPassword();
		//�˴�ģ������ݿ��л�ȡ�û��������������ж�
		if (username != null && username.equals("sun") && password != null && password.equals("123")) {
			//���û�������ӵ�Session
			session.setAttribute("USER_SESSION", user);
			//�ض�����ҳ�����ת����
			return "main";
		}
		model.addAttribute("msg", "�û�����������������µ�¼��");
		return "login";
	}
	/**
	 * �û��˳�
	 */
	@RequestMapping(value = "/logout" )
	public String logout( HttpSession session) {
		//���Session
		session.invalidate();
		return "redirect:tologin";
	}
	@RequestMapping("/stu")
	public ModelAndView findAllStudent ( ) {
		System.out.println("123446");
		List<Student> student = stuService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("student");
		modelAndView.addObject("student",student);
		return modelAndView;
	}
	
	
	@RequestMapping("/add")
	public String addStudent (Student stu ) {
		int count = stuService.addStudent(stu);
		System.out.println(count);
		return "redirect:stu";
	}
	

}
