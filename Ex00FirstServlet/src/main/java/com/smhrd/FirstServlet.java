package com.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 주석(annotation) : 일반 주석하고는 조금 다른 역할을 함
// 일반 주석 : 코드 설명, 컴파일 시에 무시됨
// 아래 주석(@) : 컴파일 할 때 한 번 확인함! (각각 역할을 가지고 있음)
// @Override : 주석이 달린 메서드가 부모 쪽에 정의되어 있지 않은 메서드일 경우 경고 표시를 해줌
// @WebServlet : URL-Mapping

// 브라우저 위 url에는 web-modulule의 path / url-mapping 값이 온다
@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	// 클래스 버전 관리 (지워도 상관 없음)
	private static final long serialVersionUID = 1L;
       
	// 생성자 -> 자바 객체
    public FirstServlet() {
        super();
        System.out.println("생성자 호출");
    }
	
    // 맨처음 생성된 자바 객체를 서블릿화(요청, 응답) 시켜주기위해 사용하는 메서드 (초기화)
    // 서블릿 객체가 최초로 생성되었을 때 초기화 시켜주고 싶은 게 있는 경우 작성
    // 객체가 생성되었을 때 딱 한 번만 실행되고 객체가 소멸되기 전까지는 다시는 실행되지 않음
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출");
	}

	// 객체 소멸 메서드
	// 서버가 재시작 / 종료 되었을 때 자동으로 호출됨
	public void destroy() {
		System.out.println("destory 호출");
	}

	// 요청/응답 처리 메서드
	// -> HTTP 요청 메서드(요청 방식 : GET, POST, PUT,...)
	// 요청 메서드에 따라 처리하는 메서드를 따로 호출해주는 기능
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response); // 부모 기능 사용
		System.out.println("service 호출");
		
		// Hello Servlet! 텍스트를 화면에 출력 (응답)
		// 클라이언트 ~~~> 서버 (request 객체 사용)
		// 텍스트를 응답 => 서버 ~~> 클라이언트 (response 객체 사용)
		PrintWriter out = response.getWriter(); //텍스트를 출력해줄 수 있는 *스트림 (통로!)
		//브라우저(크롬)에 결과 출력
		// html 태그는 무조건 문자열 안에 넣어야 함
		out.print("<b>Hello</b> Servlet!!!");
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
	}

}
