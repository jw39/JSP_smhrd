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
		request.setAttribute("nickname", "request");
	
		// 1. RequestDispatcher 사용
		// 값을 그대로 넘겨줄 수 있는 객체이다?
		// RequestDispatcher rd = request.getRequestDispatcher("Ex04RequestScope2.jsp");
		// rd.forward(request, response);
		
		// 클라이언트가 최초로 요청한 경로만 확인 가능. 
		// Ex04RequestScope2.jsp 요게 안 뜨는 거지... Ex04forward라고 뜸
		
		
		// 2. pageContext(페이지 영역) 사용
		//pageContext.forward("Ex04RequestScope2.jsp");
	
	%>
	
	<!-- 3. jsp 액션태그 : 특정한 기능을 수행할 수 있도록 명령하는 태그 -->
	<jsp:forward page="Ex04RequestScope2.jsp"/> 

</body>
</html>