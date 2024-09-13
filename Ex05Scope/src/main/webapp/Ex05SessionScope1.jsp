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
		session.setAttribute("nickname", "session");
		String nick = (String)session.getAttribute("nickname");
	%>

	<%=nick %>
	${sessionScope.nickname }
	
	<a href="Ex06SessionScope2.jsp">2 페이지</a>
</body>
</html>