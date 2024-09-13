package com.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02Number")
public class Ex02Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
    // Q2. 숫자 입력받으면 "입력한 숫자는 ? 입니다" 출력

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청 파라미터 받기
		String num = request.getParameter("num");

		// 콘솔창에 출력
		System.out.println(num);

		// 인코딩
		response.setContentType("text/html; charset=UTF-8");

		// 브라우저에 출력
		PrintWriter out = response.getWriter();
		out.print("입력한 숫자는 <b>" + num + "</b>입니다");

	}

}
