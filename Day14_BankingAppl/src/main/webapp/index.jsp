<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body class = "container text-center mt-5">
<h2><%= "Hello World!" %></h2>
<a href = "ViewAccountServlet" class = "btn btn-success me-3">View All</a>

<a href = "AddAccountServlet" class = "btn btn-success me-3" >Add Account</a>

<div class = "container">
<div class = "form-container">

<form action="GetAccountByidServlet" method = "post">

<label class = "form-label" >Enter the account number</label>
<input  type = "text" class = "form-control" name = "accNum">
<button type = "submit" class = "btn btn-success">Get Account</button>

</form>
</div>
</div>

</body>
</html>
