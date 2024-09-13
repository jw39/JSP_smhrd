<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Ex01Request.html로 이동 -->
	<%
		// 현재 실행중인 ex03Redirect.jsp의 실행을 중단하고
		// Ex01Request.html을 실행하겠다. 라는 의미
		// 페이지 자체를 이동시키는게 아니라 소괄호 안 경로만 알려주는 역할임
		// 클라이언트는 그 경로를 받아서 그 응답온 경로로 다시 요청하는 거임
		// redirect를만나는 순간 주소 응답 -> 응답받은 주소를 클라이언트가 다시 재요청
		response.sendRedirect("Ex01Request.html");
	
		// 브라우저(클라이언트)의 주소창에 있는 주소의 의미
		// 클라이언트가 해당 주소로 직접 요청했다! 라는 의미임
		
		// 페이지 이동 방법
		// 1. 리다이렉팅 (Redirecting)
		// - 서버가 클라이언트에게 주소(클라이언트가 다시 요청해야하는)를 응답
		// - 클라이언트가 해당 주소로 재요청하는 방식
		
		// * 리다이렉팅의 특징
		// - 요청과 응답이 두 번 일어남
		// 
		// - 최종 결과물 페이지의 주소가 클라이언트(브라우저)의 주소창에 드러남
		
		

		
		
	%>

</body>
</html>