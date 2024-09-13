package com.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Plus")
public class Ex03Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Q3. 숫자 입력받으면 더한 후 출력

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1 = request.getParameter("num1");
		// String -> int (형변환 필수)
		int intNum1 = Integer.parseInt(num1); //문자열에 숫자 외의 값이 없어야 함!!!
		
		// 한 줄로도 형변환이 가능하다!!!
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(intNum1 + "+" + num2 + "=" + (intNum1+num2));
		
		
		
		
		
	
	
	
	
	
	
	}

}
