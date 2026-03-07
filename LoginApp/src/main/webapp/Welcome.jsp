<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%= request.getAttribute("user") %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
    <h1 style = "color:blue"> Welcome ${user.username}</h1>
    
    <h3>User details :</h3>
   
    Username: ${user.username} <br>
    Email : ${user.email } <br>
    Mobile : ${user.mobile } <br>
    
</body>
</html>