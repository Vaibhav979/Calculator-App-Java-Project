<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class= "container">
<h1>Login</h1>
<form action="LoginServlet" method="post">
<label for="username">Username:</label>
<input type="text" name="username" id="name" required><br>
<label for="password">Password:</label>
<input type="password" id="password" name="password" required><br>
<button type="submit">Login</button>
</form>
<p><a href="index.html">Back to Home</a></p>
<% String error = request.getParameter("error");
if(error!=null && error.equals("1")){%>
<p style="color:red;">Invalid username or password. Please try again</p>
<%} %>
</div>
</body>
</html>