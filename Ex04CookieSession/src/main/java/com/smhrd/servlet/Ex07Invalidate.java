package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Ex07Invalidate")
public class Ex07Invalidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.invalidate(); //전체 삭제!
		
		// 바로 페이지 넘어가기 리다이렉팅
		response.sendRedirect("Ex05GetSession"); // 서블릿으로 가려면 url 매핑값만 적기 (확장자 없이!!)
		// jsp로 가려면 확장자 필요
	
	}

}
