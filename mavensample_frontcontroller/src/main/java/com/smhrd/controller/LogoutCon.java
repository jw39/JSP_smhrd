package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutCon implements SubController {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		// 세션 가져오기
		HttpSession session = request.getSession();

		// 세션 전체 삭제
		session.invalidate();
//				session.removeAttribute("member");

		// 페이지 이동
		return "index.jsp";

	}

}
