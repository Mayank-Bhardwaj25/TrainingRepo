
<%@page import="com.coforge.models.UserPOJO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello, Employee</h2>


<%! int a = 5, b = 7 ;%>

<%= a+b %>
<%! String name = "Mayank" ;%>
<%= "Hello "+ name %>
<br>

<%! int marks = 99 ;%>
<%= marks %>

<%! long id = 999;%>
<%= id %>
<br>
<br>

<%! int num = 78 ;%>
<%! String result = num%2 == 0 ? "Even":"Odd" ;%>
<%= result %>

<br>
<br>

<%!  UserPOJO user = new UserPOJO("Mayank", 90000) ;%>
<%= user.getName() %>
<br>
<%= user.getSalary() %>
</body>
</html>