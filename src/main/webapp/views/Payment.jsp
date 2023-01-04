<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

	<form action="/views/Success.jsp" method="post" class="container col-md-4">
		<div class="mb-3" >
			<label for="exampleInputEmail1" class="form-label">CARD NUMBER</label> <input type="text" class="form-control" name="username"
				id="exampleInputEmail1" aria-describedby="emailHelp" required>
			
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">NAME ON CARD</label>
			<input type="text" class="form-control" name="password"
				id="exampleInputPassword1" required>
		</div>
		<div class="mb-3" >
			<label for="exampleInputEmail1" class="form-label">CVC</label> <input type="password" class="form-control" name="role"
				id="exampleInputEmail1" aria-describedby="emailHelp" required>
			
		</div>
		<div class="mb-3" >
			<label for="exampleInputEmail1" class="form-label">DATE OF EXPIRY</label> <input type="date" class="form-control" name="username"
				id="exampleInputEmail1" aria-describedby="emailHelp" required>
			
		</div>
		
		
		<button type="submit" class="btn btn-success">MAKE PAYMENT</button>
	</form>
</body>
</html>