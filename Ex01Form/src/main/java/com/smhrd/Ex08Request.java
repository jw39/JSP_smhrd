package com.smhrd;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08Request")
public class Ex08Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		// String hobby = request.getParameter("hobby");
		
		// getParameter : name이 동일하게 지정된 파라미터들 중에서 첫 번째 파라미터만 반환됨
		// 체크박스 선택한 거 모두 가져오려면
		String[] hobby = request.getParameterValues("hobby"); //****문자열 배열로 받아야 함
		
		System.out.println(job);
		System.out.println(gender);
		// System.out.println(hobby); //참조값이 출력된다,, 저건 참조 변수임!!! 그 안 내용 보고 싶으면 for문이나 arrays.tostring
		System.out.println(Arrays.toString(hobby));
		// **** 내용을 보고 싶으면 배열 안 보는 거 사용 해야 행
		
	}

}
