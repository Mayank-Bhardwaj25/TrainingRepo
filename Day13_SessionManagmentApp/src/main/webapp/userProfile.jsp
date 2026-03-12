<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="bootStrapCss.jsp" %>
</head>
<body>
<%
String email = (String)session.getAttribute("email");
if(email == null) {
	response.sendRedirect("login.jsp");
	return;
}

%>
<div>
<h1>
  <%="Welcome " +email %>
  Session Id =<%= session.getId() %>
  Session CreationTime<%= new java.util.Date(session.getCreationTime()) %>
  Session Last Accessed Time: <%=new java.util.Date(session.getLastAccessedTime()) %>

</h1>
</div>
<div>
<a href = "logout.jsp" class = "btn btn-succcess">Logout</a>
</div>

<%@ include file="bootStrapScript.jsp" %>
</body>
</html>