package com.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// localhost:8081/Ex01Form/Ex05Table 요청 -> 테이블이 출력되는 html 문서를 응답
@WebServlet("/Ex05Table")
public class Ex05Table extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Q5. 숫자 입력받고 그 숫자로 테이블 생성

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		PrintWriter out = response.getWriter();
		
		out.print("<table border='1'>");
		out.print("<tr>");
		
		for(int i=1; i<=num; i++ ) {
			out.print("<td>"+i+"</td>");
		}
		
		out.print("</tr>");
		out.print("</table>");
		
		response.setContentType("text/html; charset=UTF-8");
		
//		PrintWriter out = response.getWriter();
//		
//		out.print("<table border='1'>");
//		out.print("<tr>");
//		for(int i=1; i<=6; i++) {
//			out.print("<td>"+i+"</td>");
//		}
////		out.print("<td>1</td>");
////		out.print("<td>2</td>");
////		out.print("<td>3</td>");
////		out.print("<td>4</td>");
////		out.print("<td>5</td>");
////		out.print("<td>6</td>");
//		out.print("</tr>");
//		out.print("</table>");
	
	
	}

}
