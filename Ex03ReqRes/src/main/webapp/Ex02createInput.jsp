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
	int num = Integer.parseInt(request.getParameter("num"));
	%>
	<h1>랜덤 당첨 게임</h1>
	<fieldset>
		<legend>랜덤뽑기</legend>
		<form action="Ex02randomOutput.jsp" method="post">
			<table align="center">
				<tr>
					<td>주제: <input type="text" name=subject value="오늘 점심메뉴는?"></td>
				</tr>
				<%
				for (int i = 1; i <= num; i++) {
				%>
				<tr>
					<td>아이템 : <input type="text" name="menu"></td>
				</tr>
				<%
				}
				%>

				<tr>
					<td><input type="submit" value="랜덤뽑기"></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>