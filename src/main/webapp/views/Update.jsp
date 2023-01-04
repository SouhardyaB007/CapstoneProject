<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	
  
</head>
<body>
<%@ include file="/views/AdminNavbar.jsp" %>
<!-- <iframe src="/views/UserNavbar.html" width="1400" height="85"></iframe>   -->
	<div>
		<br>
		<h2 class="text-center" style = "margin-top:8rem">Update Movie Details</h2>
		<br>
		<hr>

		<div class="container col-9">
			<form action="/admin/update" method="post">
				<div class="row">
					<div class="col">
						<div class="form-floating mb-3">
							<input type="text" class="form-control" name="movieName"
								id="foodName" placeholder="Movie Name" style="width: 30%;background:transparent;border:3px solid white;color:black"> <label
								for="movieName" style="color:black ">Movie Name</label>
						</div>
					</div>
					<br>
					<div class="col">
						<select class="form-select" name="movieGenre"
							aria-label="Default select example" style="width: 30%; background:transparent;border:3px solid white;color:black">
							<option selected>Select Genre Category</option>
							<option value="Action">Action</option>
							<option value="Comedy">Comedy</option>
							<option value="Thriller">Thriller</option>
							<option value="Romantic">Romantic</option>
							
						</select>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col">
						<div class="form-floating mb-3">
							<input type="number" class="form-control" name="moviePrice"
								id="foodprice" placeholder="Movie Price" style="width: 30%; background:transparent;border:3px solid white;color:black"> <label
								for="movieprice" style="color:black">Movie Price</label>
						</div>
					</div>
					<br>

				
					<div class="row">
						<div class="col">
							<div class="form-floating mb-3">
								<input type="text" class="form-control" name="movieLanguage"
									id="foodprice" placeholder="Movie Language" style="width: 30%; background:transparent;border:3px solid white;color:black"> <label
									for="movielanguage" style="color:black">Movie Language</label>
							</div>
						</div>
						<br>

						<div class="row">
							<div class="col">
								<div class="form-floating mb-3">
									<input type="text" class="form-control" name="movieDescription"
										id="description" placeholder="Movie Description" style="width: 50%; background:transparent;border:3px solid white;color:black"> <label
										for="moviedescription" style="color:black">Movie Description</label>
								</div>
							</div>
							<br>
							<div class="row">
						<div class="col">
							<div class="form-floating mb-3">
								<input type="text" class="form-control" name="movieReleaseDate"
									id="foodprice" placeholder="Movie Language" style="width: 30%; background:transparent;border:3px solid white;color:black"> <label
									for="movielanguage" style="color:black">Movie Release Date</label>
							</div>
						</div>	

							<div class="row">
								<div class="col">
									<div class="form-floating mb-3">
										<input type="text" class="form-control" name="movieShowTime"
											id="moviestarttime" placeholder="Movie Start Time" style="width: 30%; background:transparent;border:3px solid white;color:black"> <label
											for="moviestarttime" style="color:black">Movie Show Time</label>
									</div>
								</div>
								<br>
								
								
					

					
					<br>
			
			
					<div class="col">
						<div class="input-group mb-3">
							<input type="file" class="form-control" name="mimage" id="inputGroupFile02" style="width: 30%; background:transparent;border:3px solid white;color:black">
							<label class="input-group-text" for="inputGroupFile02"style="color:black     margin-left: 92px;">Upload Movie Image</label>
						</div>
					</div>
				</div>

				<br> <br>
				<button type="submit" class="btn btn-primary"
					style="margin-bottom: 2rem; padding-left: 1cm; padding-right: 1cm;">Submit
					Details</button>

			</form>
		</div>




	</div>




	<!--linking the bootstrap js-->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>