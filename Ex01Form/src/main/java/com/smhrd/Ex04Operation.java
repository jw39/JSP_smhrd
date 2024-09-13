package com.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04Operation")
public class Ex04Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Q4. 연산자와 숫자 선택 후 연산

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 파라미터 요청받기
		int intNum1 = Integer.parseInt( request.getParameter("num1"));
		int intNum2 = Integer.parseInt( request.getParameter("num2"));
		String ope = request.getParameter("ope");
		
		// 인코딩
		response.setContentType("text/html; charset=UTF-8");
		
		// 출력하기 위한..
		PrintWriter out = response.getWriter();
				
		if (ope.equals("plus")) {
			out.print(intNum1 + "+" + intNum2 + "=" + (intNum1+intNum2));
		} else if(ope.equals("-")) {
			out.print(intNum1 + ope + intNum2 + "=" + (intNum1-intNum2));
		} else if (ope.equals("*")) {
			out.print(intNum1 + ope + intNum2 + "=" + (intNum1*intNum2));
		} else if (ope.equals("/")) {
			out.print(intNum1 + ope + intNum2 + "=" + (intNum1/intNum2));
		}

		
	}

}
