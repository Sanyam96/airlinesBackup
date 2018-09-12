<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Page</title>
</head>
<body>
    <div align="center">
        <h1>Users List</h1>
        <h3>
            <a href="newUser">New User</a>
        </h3>
        <table border="1">

            <th>id</th>
            <th>username</th>
            <th>password</th>

            <c:forEach var="user" items="${listUsers}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>