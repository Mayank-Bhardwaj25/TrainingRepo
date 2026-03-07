<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>




<body class = "bg-light">

<div class = "container mt-5">
<div class = "card shadow p-4 mx-auto" style = "width:400px;">
<h2 class = "text-center mb-4">SignIn</h2>

<form action = "LoginServlet" method = "get">
  <div class="mb-3">
    <label for="form-label" class="form-label">Username</label>
    <input type="text" class="form-control" name = "uname" required>
<!--     <div id="e" class="form-text">We'll never share your email with anyone else.</div> -->
  </div>
  <div class="mb-3">
    <label for="form-label" class="form-label">Password</label>
    <input type="password" class="form-control" name = "pwd" required>
  </div>
  
  
  
  
  <button type="submit" class="btn btn-primary w-100">SignIn</button>
</form>

</div>
</div>


 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>

<!-- <body> -->

<!--   <h1>Login Form</h1> -->
<!--   <form action="LoginServlet" method ="get"> -->
  
<!--    <label> Username:</label> -->
<!--    <input type = "text" name = "uname"> -->
<!--    <br> -->
   
<!--    <label>Password : </label> -->
<!--    <input type = "password" name ="pwd"> -->
   
<!--    <br> -->
   
<!--    <button>Login</button> -->
  
<!--   </form> -->

<!-- </body> -->
</html>