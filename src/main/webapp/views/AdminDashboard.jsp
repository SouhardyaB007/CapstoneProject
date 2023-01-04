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

<jsp:include  page="/views/AdminNavbar.jsp" />


<h1 style="text-align: center;">ALL MOVIES </h1>


<table class="container table table-hover">

<tr><th></th><td>Movie Id</td><th>MOVIE POSTER</th><th>MOVIE NAME</th><th>MOVIE GENRE</th><th>MOVIE LANGUAGE</th><th>MOVIE SHOWTIME</th><th>MOVIE DESCRIPTION</th><th>MOVIE RELEASEDATE</th><th>MOVIE PRICE</th></tr>


<c:forEach items="${movieList}" var="product"  >


<tr><td></td><td>${movie.movieId}</td> <td><img src="/images/${movie.movieImageUrl}"style="height: 301px; width: 301px;"/></td>
     <td>${movie.movieName}</td> <td>${movie.movieGenre}</td> <td>${movie.movieLanguage}</td><td>${movie.movieShowTime}</td><td>${movie.movieDescription}</td><td>${movie.movieReleaseDate}</td><td>${movie.moviePrice}</td>
     
     <td>
<form class="container col-md-4"  action="http://localhost:8080/admin/delete/?movieId" method="post">
 <input type="hidden"  value="${movie.movieId}" name="movieId" />
 
<button type="submit"  class="btn btn-danger"   value="delete" name="action">Delete</button>
</form>
	
</td>
<td>
<form class="container col-md-4"  action="http://localhost:8080/admin/update" method="post">
 <input type="hidden"  value="${movie.movieId}" name="movieId" />
 
<button type="submit"  class="btn btn-warning"   value="delete" name="action">Update</button>
</form>
	
</td>
     
     
     
      </tr>
</c:forEach>


</table>



</body>
</html>