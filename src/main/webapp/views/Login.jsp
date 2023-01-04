<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MOVIE | Login</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>

<body style="background-color: blueviolet;">
<form action="/loginUser" method="post" class="container col-md-4">
		<div class="mb-3" >
			<label for="exampleInputEmail1" class="form-label">Username</label> <input type="text" class="form-control" name="username"
				id="exampleInputEmail1" aria-describedby="emailHelp" required>
			
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" class="form-control" name="password"
				id="exampleInputPassword1" required>
		</div>
		
		<button type="submit" id="login"class="btn btn-primary btn-block btn-large login">Login</button><br><br>
		<p style="color: yellow;">New User</p>
            <a href="/views/Register.jsp">Register</a>
		</form>
</body>
</html>