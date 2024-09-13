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
		pageContext.setAttribute("nickname", "page");
	
		request.setAttribute("nickname", "request");
	
		String nick =  (String)request.getAttribute("nickname");
	
	%>
	
	<%=nick %>
	${requestScope.nickname } <!-- 여긴 리퀘스트.. 스코프 부분의 닉네임 -->
	${nickname } <!-- 여긴 페이지 부분의 닉네임 -->
	
	<a href="Ex04RequestScope2.jsp">2 페이지</a>

</body>
</html>