<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	// 쿠키 확인 (nama, value)
	// 1. 클라이언트 -> 서버
	// 복수개 가져올 수 있고, 배열 타입으로 가져 옴
	Cookie[] cookies = request.getCookies();

	// 2. 쿠키 정보 출력
	for (Cookie c : cookies) {
		out.print(c.getName() + ":" + c.getValue() + "<br>");

	}
	%>
	
	<!-- F12 눌러서 확인한 후 session 쿠키는 창을 닫으면 사라지는 쿠키 --> 
	
	
	<a href="Ex03RemoveCookie.jsp">쿠키 삭제</a>
	
	
	
	
	
	
	
</body>
</html>