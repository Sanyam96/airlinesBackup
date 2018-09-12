<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
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
					<td>${flight.flightNumber}</td>
					<td>${flight.flightTime}</td>
					<td>${flight.flightDuration}</td>
					<td>${flight.flightFare}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br><br>
</body>
</html>