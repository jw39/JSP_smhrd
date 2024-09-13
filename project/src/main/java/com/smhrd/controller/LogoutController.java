package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MavenMember;
import com.smhrd.model.MavenMemberDAO;

public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 세션 가져오기
		HttpSession session = request.getSession();
		
		// 세션 전체 삭제
		session.invalidate();
//		session.removeAttribute("member");

		// 페이지 이동
		response.sendRedirect("index.jsp");

	}

}
