<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<%
	request.setCharacterEncoding("UTF-8");
	String[] menu = request.getParameterValues("menu");
	String sub = request.getParameter("subject");
	Random rm = new Random();
	int ran = rm.nextInt(menu.length);
	%>
	<h1>랜덤 당첨 게임</h1>

	<fieldset>
		<legend>랜덤뽑기결과</legend>

		<table align="center">

			<tr>
				<td><%=sub%></td>
			</tr>
			<tr>
				<td><%=menu[ran]%></td>
			</tr>
		</table>

	</fieldset>

</body>
</html>