package com.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07GetPost")
public class Ex07GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Q7. http 메소드 get, post 차이(주소창에 파라미터가 보이냐 마냐) 그리고 인코딩 위치가 핵심

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// GET 요청 데이터: sever.xml URIEncoding 속성 추가 => 파라미터가 URI에 포함되어 있기 때문
		// POST 요청 데이터 : 데이터를 받을 때 마다 인코딩을 지정해야 함 => 데이터 패킷의 body에 포함됨
		// *** 인코딩 코드의 위치가 중요함 ,, 요청에 대한 파라미터 인코딩 설정을 먼저 한 후 파라미터를 받아와야 함
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		System.out.println(name);
		
		
		
		
		
	}

}
