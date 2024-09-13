<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%for(int i=1; i<=10; i++){ %>
		<%=i %>
	<%} %>
	
	<!-- c~ : JSTL 태그 -->
	<!-- el 표기법 : 특정 영역에 저장된 값을 사용할 수 있는 문법! 
	자바 변수를 사용해 쓸 수 는 없고 var i를 가져와 사용한 거임
	주석 안에 모냥새 적지 마삼... 주석도,, 다 인식해버림
						 시작=" "  끝=" "    스텝=" " -->
	<c:forEach var="i" begin="1" end="10" step="1">
		${i }
	</c:forEach>
	
	
	
</body>
</html>