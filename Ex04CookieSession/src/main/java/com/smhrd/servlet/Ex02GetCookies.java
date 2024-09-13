package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02GetCookies")
public class Ex02GetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 쿠키 확인 (nama, value)
		// 1. 클라이언트 -> 서버
		// 복수개 가져올 수 있고, 배열 타입으로 가져 옴
		Cookie[] cookies = request.getCookies();
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// 2. 쿠키 정보 출력
		for (Cookie c : cookies) {
			out.print(c.getName() + ":" + c.getValue() + "<br>");

		}

	}

}
