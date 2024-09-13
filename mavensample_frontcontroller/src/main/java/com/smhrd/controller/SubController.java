package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SubController {
	// 요청을 처리할 컨트롤러 클래스에서 재구현할 인터페이스 (Command interface)
	// 요청을 처리하기 위한 process 메서드를 오버라이딩할 수 있게 강제성 부여
	// process -> Servlet class (service 메서드)
	
	// 실제 요청을 받고 응답을 해주는 클래스 -> frontController
	// process 요청 관련 처리 / (응답 관련해서는 rpocess메서드가 응답까지 해주는게 아니라 응답하는 건 프론트 컨트롤러가 할 거고)
	// 응답 (최종적으로 이동해야 하는 페이지의 경로만 리턴해서 프론트 컨트롤러에게 알려주면 프론트 컨트롤러가 그 후엔 알아서,,)
	public String process(HttpServletRequest request, HttpServletResponse response);

}
