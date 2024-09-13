package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex05GetSession")
public class Ex05GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 서블릿은 내장객체가 앖어서 세션객체 생성부터 해야 함
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("id"); //세션 없으면 null 값
		Integer age = (Integer)session.getAttribute("age");
		// Integer로 형변환을 하면 기본자료형이 아니기 때문에 null로 반환 가능, int와 달리 오류 안 뜸
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(id + "<br>" + age);	
	
	}

}
