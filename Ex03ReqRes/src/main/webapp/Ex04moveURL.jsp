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
	String URL = request.getParameter("page");

	if (URL.equals("네이버")) {
		response.sendRedirect("https://www.naver.com");
	} else if (URL.equals("다음")) {
		response.sendRedirect("https://www.daum.net/");
	} else if (URL.equals("구글")) {
		response.sendRedirect("https://www.google.com");
	}
	// 리다이렉팅이 한 곳에 두 줄 있는 것은 무의미함. 만나자마자 요청하기 때문에 맨 윗줄만 적용됨
	%>


</body>
</html>