package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Ex07LoginCheck")
public class Ex07LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); // 괜히 인코딩 해봄
		
		String id = request.getParameter("id"); //html에서 입력한 id, pw 받아옴
		String pw = request.getParameter("pw");
		
		
		if(id.equals("test")&&pw.equals("12345")) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("Ex07Main.jsp");
		} else {
			// 로그인 실패
			response.sendRedirect("Ex07LoginForm.html");
		}
	
	
	
	
	
	
	
	
	}

}
