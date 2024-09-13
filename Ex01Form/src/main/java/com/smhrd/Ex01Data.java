package com.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class Ex01Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Q1. 문자 입력하면 문자 그대로 출력

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Tomcat9 (8 버전 이상부터는 요청 데이터 인코딩 기본 방식 : UTF-8)
		// 이하 버전을 사용하는 경우에는 기본 방식 : EUC-KR => 한글 데이터 깨짐
		
		// 요청 파라미터 받기 (사용자가 입력한 값 받기)
		// 클라이언트가 ~> 서버로 보내는 것 => 요청! (request로 다루면 됨)
		// getParameter("input에 지정한 name값"); -> 그 값을 반환할 것임
		// 반환할 건데 변수에 담아줘야함. 근데 엥간 문자열로 반환되어서 string 사용함
		String data = request.getParameter("data");
		
		// <콘솔창에 출력>
		System.out.println(data);
		// 하고 여기는 반환받을 것이기 때문에 html만 새로고침 해주면 된다.
		// 콘솔창에 html에서 입력한 값이 잘 출력되는지 확인해야 한다!
		
		// 응답 데이터 인코딩 설정 (생략 가능)
		response.setCharacterEncoding("UTF-8");
		// ★★★★★★클라이언트 (브라우저)에 응답 데이터의 형식과 인코딩 방식을 알려줘야 함!★★★★★★
		response.setContentType("text/html; charset=UTF-8");
		
		// <브라우저(클라이언트) 화면에 출력>
		PrintWriter out = response.getWriter();
		out.print(data);
		
	}

}
