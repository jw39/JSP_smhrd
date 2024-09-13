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
		// 세션 확인	 강제 형변환 필요 		대소문자 구별 함
		String id = (String)session.getAttribute("id");
		Integer age = (Integer)session.getAttribute("age");
		// 이 값은 브라우저가 종료되면 값이 사라짐
		// 브라우저 종료한 다음 여기 임의적으로 실행하면 값이 없을테니까 String타입은 null 반환함
		// int 타입은 null 값으로 반환 못하니까 오류 남
	
	%>
	
	<%=id %> <br>
	<%=age %>
	
	<a href="Ex06RemoveSession.jsp">세션 삭제</a>
	<a href="Ex07Invalidate">세션 모두 삭제</a>
</body>
</html>