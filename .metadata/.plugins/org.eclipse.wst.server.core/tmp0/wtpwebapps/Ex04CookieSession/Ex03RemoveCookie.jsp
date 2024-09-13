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
		// 쿠키 삭제
		// 1. 삭제하고 싶은 쿠키와 같은 name을 가진 쿠키를 생성
		Cookie cookie = new Cookie("test", "");
		// value는 그대로 적어도 되고 아니어도 됨, 어차피 삭제할 거니까 name이 중요함
		
		// 2. 만료기간 setMaxAge (초단위) 0초로 설정
		cookie.setMaxAge(0);
		// name이 같은 쿠키를 만들고 덮어씌우기 처럼 만들고(같은 놈은 존재 못하니께,,) 초를 0초로 해서 아예 안 보이게 함
	
		// 3. 쿠키를 클라이언트로 전송
		response.addCookie(cookie);
	
	%>
	
	<a href="Ex02GetCookies">쿠키 확인</a>
	<!-- url 매핑값 적기. 서블릿은 .java 라는 확장자를 적지 않음 -->
	
	
	
</body>
</html>