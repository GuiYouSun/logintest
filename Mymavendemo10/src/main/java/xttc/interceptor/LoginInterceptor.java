package xttc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response , Object handler) throws Exception{
		//获取请求的路径
		String uri =request.getRequestURI();
		
		//对用户登录的相关请求放行
		//indexof判断后边参数是否含有  login字符串       有:>=0  
		if (uri.indexOf("/login") >= 0) {
			return true;
			
		}
		HttpSession session = request.getSession();
		
		//如果用户是已登录状态 ， 放行
		if (session.getAttribute("USER_SESSION") != null) {
			return true;
			
		}
		//其他情况都直接跳转到登录页面
		request.setAttribute("msg", "您还没有登录，请先登录  ！");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		return false;
	}
}
