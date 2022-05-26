package xttc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response , Object handler) throws Exception{
		//��ȡ�����·��
		String uri =request.getRequestURI();
		
		//���û���¼������������
		//indexof�жϺ�߲����Ƿ���  login�ַ���       ��:>=0  
		if (uri.indexOf("/login") >= 0) {
			return true;
			
		}
		HttpSession session = request.getSession();
		
		//����û����ѵ�¼״̬ �� ����
		if (session.getAttribute("USER_SESSION") != null) {
			return true;
			
		}
		//���������ֱ����ת����¼ҳ��
		request.setAttribute("msg", "����û�е�¼�����ȵ�¼  ��");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		return false;
	}
}
