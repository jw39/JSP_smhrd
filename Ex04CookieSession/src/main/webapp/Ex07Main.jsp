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
		// 세션 값 가져오기
		String id = (String)session.getAttribute("id");
	%>
	
	<%=id %>님 환영합니다.

	<a href="Ex07Logout">로그아웃</a>


</body>
</html>