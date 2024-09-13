package com.smhrd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MavenMember;
import com.smhrd.model.MavenMemberDAO;

// 모든 요청을 받아줄 컨트롤러 (*.do)
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// List<> al = new ArrayList<>();
	// 부모 격으로 올리는..? 유연하게 쓰는..?

	// 자바 객체가 생성된 후 한 번만 실해되는 메서드
	// -> 서블릿의 역할을 수행할 수 있도록 초기화 + 초기화 시 실행하고 싶은 기능이 있다면 추가

	Map<String, SubController> map = null; // map이 init에서만 있으니까 여기서 초기화때려서 service에 사용하게 만들자!

	public void init(ServletConfig config) throws ServletException {
		// 들어올 수 있느 요청에 관련된 리스트 작성, 사용할 컨트롤러도 생성
		// Map : 순서가 없음(인덱스x), key-value

		map = new HashMap<>(); // (import) 필요
		// key (String "/JoinController.do") - value ( JoinCon메서드 호출해 사용)
		// key (String "/LoginController.do") - value ( LoginCon메서드 호출해 사용)
		map.put("/JoinController.do", new JoinCon());
		map.put("/LoginController.do", new LoginCon());
		map.put("/LogoutController.do", new LogoutCon());

//		 JoinCon con = (JoinCon) map.get("/JoinController.do"); //필요하면 다운캐스팅, 앞쪽에 키 값 넣으면 뒤에 있는 값이 리턴된다
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 여기서 요청이 들어올 테니까 여기서 바로 인코딩 때리기
		request.setCharacterEncoding("UTF-8");

		// uri 출력 -> /mavensample/LoginController.do 이게 나옴
		String requestUri = request.getRequestURI();
		System.out.println(requestUri);
		// mavensample/JoinController.do
		// mavensample/LoginController.do

		// 경로 출력하겠다 -> /mavensample 이게 나옴
		String contextpath = request.getContextPath();
		System.out.println(contextpath);
		// mavensample

		// /mavensample 자른 경로 출력하겠다.
		String path = requestUri.substring(contextpath.length());
		// 숫자로 지정해 문자를 자르는 메서드, mavensample을 자르고 싶어서 그러는 거임
		// 숫자의 길이를 구하고 한 숫자 지정해서 그 이후를 자르겠다

		// 잘려진 경로(깔끔해진 경로) 출력
		System.out.println(path);
		// /JoinController.do
		// /LohinController
		
		SubController subController = map.get(path); //-> 로그인컨트롤러든 뭐든 서브 컨트롤러 타입으로 업캐스팅 후 받을 수 있다.
		String des = subController.process(request, response);
		
		response.sendRedirect(des);
		
		
	}

}
