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
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
	
		if(id.equals("smart")&&pw.equals("123")){	
			// 클라이언트에게 localhost:8081/Ex03ReqRes/Ex05LoginSuccess.jsp로 요청해!
			// + 위 주소에 파라미터를 포함시켜주는 방법 => 쿼리스트링
			// response.sendRedirect("Ex05LoginSuccess.jsp?id="+id);
			
			// 페이지 이동방법
			// 1. 리다이렉팅 : Response.sendRedirect()
			// 2. 포워딩 (forwarding) -> 서버 차원에 페이지 이동이 일어난 후 응답 (요청, 응답 1번)
			
			// RequestDispatcher: 클라이언트로부터 최초에 들어온 요청을 원하는 자원(페이지)으로 넘기는 기능을 포함하고 있는 객체
			RequestDispatcher rd = request.getRequestDispatcher("Ex05LoginSuccess.jsp");
			// 현재 사용하고 있는 request, response 객체를 다음 페이지로 넘기는 기능
			rd.forward(request, response);
			
			// success.jsp 페이지는 서버가 요청한 거니까 (클라이언트가 요청한 페이지는 login.jsp이니까)
			// 주소창에도 Ex05Login.jsp만 뜬다
			
			// 차이점을 잘 인지하고 경우에 따라 사용하자
			
			// 1 -> 주소창에 주소도 다 보이게 하고 뭐,, 그러고 싶으면 사용
			// 2 -> 파라미터도 전달하고 클라이언트가 최초로 요청한 페이지만 보이게 하려면 !!
			
		} else {
			response.sendRedirect("Ex05LoginFail.jsp");
		}
		
		%>




</body>
</html>