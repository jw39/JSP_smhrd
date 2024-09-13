package com.smhrd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex09Join")
public class Ex09Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청받을 파라미터 인코딩
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwC = request.getParameter("pwC");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String date = request.getParameter("date");
		String [] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String ta = request.getParameter("ta");
		
		// 응답하는 문자의 인코딩 형식
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 브라우저 상에서 출력
		out.print("<p>아이디 : " + id +"</p>");
		
		out.print("<p>비밀번호 : " + pw +"</p>");
		if(pw.equals(pwC)) {
			out.print("<p>비밀번호가 일치합니다</p>");
		} else {
			out.print("<p>비밀번호가 일치하지 않습니다</p>");
		}
		out.print("<p>성별 : " + gender +"</p>");
		out.print("<p>혈액형 : " + blood +"</p>");
		out.print("<p>생일 : " + date +"</p>");
		out.print("<p>취미 : "  +Arrays.toString(hobby) +"</p>");
		out.print("<p>좋아하는 색 : " + color +"</p>");
		out.print("<p>남기고 싶은 말 : " + ta +"</p>");
		
		
		// 콘솔창 출력
		
//		System.out.println("아이디 : " + id);
//		System.out.println("비밀번호 : " + pw);
//		if(pw.equals("pwC")) {
//			System.out.println("비밀번호가 일치합니다");
//		} else {
//			System.out.println("비밀번호가 일치하지 않습니다");
//		}
//		System.out.println("성별 : " + gender);
//		System.out.println("혈액형 : " + blood);
//		System.out.println("생일 : " + date);
//		System.out.println("취미 : "  +Arrays.toString(hobby));
//		System.out.println("좋아하는 색 : " + color);
//		System.out.println("남기고 싶은 말 : " + ta);
		
		
		// 함수 만들려다가 못한 거
//		public String getTag(String str) {
//			String st = ''
//			out.print("<p>" + str + "</p>")
//			return st;
//			
//		}
		
		
		

		
		
	
	
	
	
	
	
	
	
	
	
	}

}
