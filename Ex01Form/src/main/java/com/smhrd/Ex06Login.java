package com.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex06Login")
public class Ex06Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Q6. http 요청 메서드 - POST(파라미터가 주소창에 보이지 않음)

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("로그인");
	
	
	
	
	}

}
