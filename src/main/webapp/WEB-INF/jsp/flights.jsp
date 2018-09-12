<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Flight Page</title>
</head>
<body>

    <div align="center">
		<form action="searchFlights" method="POST" modelAttribute="flightSearchData">
        		Departure location :<input type="text" name="depInput"/><br />
        		Arrival location<input type="text" name="arrInput"/><br />
        		date :<input type="date" name="flightDate"/><br />
        		class : <input type="text" name="flightClass"/><br />
        		outputPref :<input type="text" name="sortPreference"/><br />
        		<input type="submit">
        </form>
	</div>



    <div align="center">
        <h1>Flights List</h1>
        <table border="1">

            <th>id</th>
            <th>flightnumber</th>
            <th>departurelocation</th>
            <th>arrivallocation</th>
            <th>validtill</th>
            <th>flighttime</th>
            <th><flightduration/th>
            <th>fare</th>
            <th>seatavailability</th>
            <th>class</th>

            <c:forEach var="flights" items="${allFlights}">
                <tr>
                    <td>${flights.id}</td>
                    <td>${flights.flightNumber}</td>
                    <td>${flights.departureLocation}</td>
                    <td>${flights.arrivalLocation}</td>
                    <td>${flights.validTillDate}</td>
                    <td>${flights.flightTime}</td>
                    <td>${flights.flightDuration}</td>
                    <td>${flights.flightFare}</td>
                    <td>${flights.isFlightAvailable}</td>
                    <td>${flights.flightClass}</td>

                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>