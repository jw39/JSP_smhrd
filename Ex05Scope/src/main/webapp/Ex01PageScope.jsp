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
		// 페이지 영역 (page Scope)
		// : 실제 값이 선언된 페이지에서만 사용 가능
		
		// 반환 타입은 void 형식, 페이지 영역에 값 저장
		pageContext.setAttribute("nickname", "page");
	
		// 반환 타입은 object. 가지고 오겠다.
		String nick = (String)pageContext.getAttribute("nickname");
	%>
	
	<%=nick %>
	<!-- getA로 가져와서 자바 변수에 담은 걸 출력한 것임 -->
	
	${nickname }
	<!-- 페이지 영역 안에 있는 값을 꺼내다가 출력한 것임 -->
	
	<a href="Ex02PageScope2.jsp">2 페이지</a>
</body>
</html>