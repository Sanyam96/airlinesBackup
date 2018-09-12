<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
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
	<div align="center">
		<h1>Flights matching your Search criteria:</h1>
		<br>
		Departure Location: ${flightSearchData.depInput} &nbsp; &nbsp; &nbsp;
		Arrival Location: ${flightSearchData.arrInput}<br>
		Flight Date: ${flightSearchData.flightDate}<br>
		Flight Class: ${flightSearchData.flightClass}<br><br>
		<table border="1">
			<tr>
				<th>FlightNo</th>
				<th>Flight Time</th>
				<th>Duration</th>
				<th>Fare</th>
			</tr>

			<c:forEach var="flight" items="${searchedFlights}">
				<tr>
					<td>${flight.flightNo}</td>
					<td>${flight.flightTime}</td>
					<td>${flight.duration}</td>
					<td>${flight.fare}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br><br>
	<div>
		Click <a href="http://localhost:9999/Airlines/homepage">here</a> to search again.
	</div>
</body>
</html>