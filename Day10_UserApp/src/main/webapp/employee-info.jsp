<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>


<div class = "container mt-4">

  <div class = "card shadow">
  
     <div class = "card-header bg-dark text-white">
     
     <h3>
     Employee Information
     </h3>
     
     </div>
  <div class = "card-body" >
  
  <form >
  
  
  
  <label class = "form-label">Employee Name</label>
  <input type = "text" class = "form-control" name = "ename"  value = "${employee.ename}" ${ readonly ? "readonly": ""}/>
 
  </div>
  
  
  <div class = "mb-3">
  
  <label class = "form-label">Employee Salary :</label>
  <input type = "text" class = "form-control" name = "salary"  value = "${employee.salary}" ${ readonly ? "readonly": ""}/>
  
  </div>
  
  
  <div class = "mb-3">
  
  <label class = "form-label">Employee mail :</label>
  <input type = "text" class = "form-control" name = "email"  value = "${employee.email}" ${ readonly ? "readonly": ""}/>
  
  </div>
  
  <div class = "mb-3">
  
  <label class = "form-label">Employee Mobile :</label>
  <input type = "text" class = "form-control" name = "mobile"  value = "${employee.mobile}" ${ readonly ? "readonly": ""}/>
  
  </div>
  
  
    <div class = "mb-3">
  
  <label class = "form-label">Employee DOJ :</label>
  <input type = "text" class = "form-control" name = "doj"  value = "${employee.doj}" ${ readonly ? "readonly": ""}/>
  
  </div>
  
    <div class = "mb-3">
  
  <label class = "form-label">Employee DOB :</label>
  <input type = "text" class = "form-control" name = "dob"  value = "${employee.dob}" ${ readonly ? "readonly": ""}/>
  
  </div>
  
  
  
  <a href = "EmployeeServlet?action=list" class = "btn btn-primary">Back</a>
  </form>
  
  </div>
  
  
  </div>
   

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>