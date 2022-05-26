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
	//跳转到系统首页
	@RequestMapping("/main")
	public String toMainPage() {
		return "main" ;
	}
	//跳转到登录页面
	@RequestMapping( "/tologin")
	public String toLoginPage( ){
		return "login";
	}
	//跳转到订单信息页面
	@RequestMapping( "orderinfo")
	public String orderinfo() {
		return "orderinfo" ;
	}
	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/login" )
	public String login(User user,Model model , HttpSession session) {
		System.out.println("controller");
		//获取用户名和密码
		String username = user.getUsername();
		String password = user.getPassword();
		//此处模拟从数据库中获取用户名和密码后进行判断
		if (username != null && username.equals("sun") && password != null && password.equals("123")) {
			//将用户对象添加到Session
			session.setAttribute("USER_SESSION", user);
			//重定向到主页面的跳转方法
			return "main";
		}
		model.addAttribute("msg", "用户名或密码错误请重新登录！");
		return "login";
	}
	/**
	 * 用户退出
	 */
	@RequestMapping(value = "/logout" )
	public String logout( HttpSession session) {
		//清除Session
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
