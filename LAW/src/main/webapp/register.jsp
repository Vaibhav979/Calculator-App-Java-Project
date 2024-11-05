<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container">
<h2>Registration Page</h2>
<form action="RegisterServlet" method="POST">
<label for="name">Name:</label>
<input type="text" id="name" name="name" required><br>

<label for="email">Email:</label>
<input type="email" id="email" name="email" required><br>

<label for="password">Password:</label>
<input type="password" id="password" name="password" required><br><br>

<label for="role">Role:</label>
<select id="role" name="role" required>
<option value="user">User</option>
<option value="authority">Authority</option>
</select><br><br><br>

<button type="submit">Register</button>
</form>
</div>
</body>
</html>