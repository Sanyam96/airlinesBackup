<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
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
		<h2>Hello User. Please Log In</h2>
		<br><br>
		<form:form action="homepage" method="post" modelAttribute="user">
			Username: <form:input path="username"/><br><br>
			Password: <form:password path="password"/><br><br>
			<input type="submit" value="Log In">
		</form:form>
	</div>
</body>
</html>