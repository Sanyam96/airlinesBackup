<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Flight Booking</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style>
body {
	background-image:
		url("http://mapiraj.me/wp-content/uploads/2018/04/website-background-images-1.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	background-position: center;
	background-attachment: fixed;
	height: 100%;
}
</style>
</head>
<body>
	<div class="bg-info">
		<h2 class="text-light font-weight-light p-3">Flight Booking</h2>
	</div>
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-10 d-flex justify-content-center my-5">
			<form class="form-inline">
				<input class="form-control mr-1" type="text" placeholder="From" required>
				<input class="form-control mr-1" type="text" placeholder="To" required>
				<input class="form-control mr-1" type="date" name="travel-date">
				<select class="form-control mr-1">
					<option value="volvo">Economy</option>
					<option value="saab">Business</option>
				</select>
				<select class="form-control mr-1">
					<option value="volvo">Sort by Fare</option>
					<option value="saab">Sort by Fare and Duration</option>
				</select>
				<input class="btn btn-light text-info" type="submit" value="Search">
			</form>
		</div>
		<div class="col-md-1"></div>
	</div>
</body>
</html>
