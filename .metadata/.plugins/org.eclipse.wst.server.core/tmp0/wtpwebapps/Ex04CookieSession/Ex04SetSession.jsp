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
		// 세션 생성
		// (HttpSession session)
		// setAttribute("name", value(object 타입 (name처럼 문자열 제한 없음)))
		session.setAttribute("id", "smhrd");
		session.setAttribute("age", 20);

	%>
	
	<a href="Ex05GetSession.jsp">세션 확인</a>


</body>
</html>