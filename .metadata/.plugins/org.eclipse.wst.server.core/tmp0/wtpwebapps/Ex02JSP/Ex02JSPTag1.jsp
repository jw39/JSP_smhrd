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
		// 스크립틀릿 : html 안에서 자바를 작성할 수 있는 영역
		int num1 = 20;
		int num2 = 30;
		int sum = num1 + num2;
		System.out.print(sum); //브라우저 말고 콘솔창에 출력
	%>
	
	
	<%=sum %> <br>
	<b><%=sum*100 %></b>
	<%=Math.abs(-50) %> <br>

	<table border="1">
		<tr>
			<% for (int i = 1; i < 11; i++) { %>
			<td><%=i%></td>
			<% }%>
		</tr>
		
		<tr>
			<%
				for(int i=1; i<=10; i++){
					// JSPWriter (PrintWriter와 같은 역할 - 텍스트 출력 스트림)
					// 내장객체 (JSP -> Servlet 형태로 변환 시 자동으로 생성되는 객체)
					out.print("<td>"+i+"</td>");
				}

			%>
		</tr>
	</table>



</body>
</html>