package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MavenMember;
import com.smhrd.model.MavenMemberDAO;

public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nickname = request.getParameter("nickname");
	
		// 1. DB 생성 (mavenmember - id, pw, nickname)
		// - MyBatis (파라미터를 하나로 묶어서 넘겨줘야함) -> vo 클래스 설계 후 묶기
		// 2. VO 클래스 설계 => DB TABLE 형태와 맞춰줘야함
		// (테이블 이름->클래스 이름, 컬럼의 이름,타입 -> 필드)
		
		MavenMember member =  new MavenMember(id, pw, nickname);
	
		MavenMemberDAO dao = new MavenMemberDAO(); // 객체 생성
		int res = dao.join(member); // 메서드 호출
		
		if(res>0) {
			// 회원가입 성공
			response.sendRedirect("index.jsp");
		} else {
			// 회원가입 실패
			response.sendRedirect("join.sjp");
		}
	
	}

}
