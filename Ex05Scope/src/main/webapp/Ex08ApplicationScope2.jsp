<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${applicationScope.nickname }
	
	<%
		String nick = (String)application.getAttribute("nickname");
	
	%>

	<%=nick %>
</body>
</html>