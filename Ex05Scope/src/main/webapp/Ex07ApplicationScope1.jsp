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
		application.setAttribute("nickname", "application");
	
		String nick = (String)application.getAttribute("nickname");
	%>

	<%=nick %>
	${applicationScope.nickname }
	
	<a href="Ex08ApplicationScope2.jsp">2 페이지</a>
</body>
</html>