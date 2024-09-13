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
		// - 쿠키 생성
		// 1. 쿠키(name, value) 객체 생성
		// new Cookie("name", "value"); -> 여러 개 한 번에 저장 못함 
		Cookie cookie = new Cookie("test", "testcookie");
		
		// 2. 만료기간 (초 단위)
		cookie.setMaxAge(60*60*24*365); //1년
		// 서버 쪽에서 진행해주는 작업. 보관은 클라이언트 쪽에서 해줘야 함
	
		// 3. 쿠키를 클라이언트에게 전송 
		// 서버 -> 클라이언트 = response , 클라이언트 -> 서버 = request
		response.addCookie(cookie);
		
		
		// 한 줄로 요약
		response.addCookie(new Cookie("id", "smart"));

	%>
	
		
	<a href="Ex02GetCookies.jsp">쿠키 확인</a>





</body>
</html>