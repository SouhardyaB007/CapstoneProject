<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
    
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">




<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<h1 style="text-align: center;"> CART </h1>


<table class="container table table-hover">

<tr><th></th><td>CART Id</td><th>MOVIE POSTER</th><th>MOVIE NAME</th><th>MOVIE GENRE</th><th>MOVIE LANGUAGE</th><th>MOVIE SHOWTIME</th><th>MOVIE DESCRIPTION</th><th>MOVIE RELEASEDATE</th><th>MOVIE PRICE</th></tr>


<c:forEach items="${cartList}" var="product"  >


<tr><td></td><td>${cart.cartId}</td> <td><img src="/images/${cart.movieImageUrl}"style="height: 301px; width: 301px;"/></td>
     <td>${cart.movieName}</td> <td>${cart.movieGenre}</td> <td>${cart.movieLanguage}</td><td>${cart.movieShowTime}</td><td>${cart.movieDescription}</td><td>${cart.movieReleaseDate}</td><td>${cart.moviePrice}</td>
     
     <td>
<form class="container col-md-4"  action="http://localhost:8080/user/delete/?cartId" method="post">
 <input type="hidden"  value="${cart.cartId}" name="movieId" />
 
<button type="submit"  class="btn btn-danger"   value="delete" name="action">Delete</button>
</form>
	
</td>

     
     
     
      </tr>
</c:forEach>


</table>

<button type="submit" id="login"class="btn btn-warning btn-block btn-large login"><a href="/views/Payment.jsp">CHECKOUT</a></button>


</body>
</html>