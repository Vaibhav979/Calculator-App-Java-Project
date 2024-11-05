<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<style>
img{
height:40%;
width:40%;
}

body{
text-align:center;
background:linear-gradient(to right, #2b40ff,#07121a);
}
</style>
<body>
<img src="https://media1.tenor.com/m/cFu09AEF9A8AAAAC/noot-noot-meme.gif">
<h1>My Calculator App</h1><br>
<form action="MyServlet">
<input placeholder="number 1" name ="num1"></input>
<input placeholder="number 2" name ="num2"></input>
<button name="bt1" value="+">+</button>
<button name="bt1" value="-">-</button>
<button name="bt1" value="*">*</button>
<button name="bt1" value="/">/</button>
</form>
<h1>Ans=<%=request.getParameter("ans") %></h1>
</body>
</html>