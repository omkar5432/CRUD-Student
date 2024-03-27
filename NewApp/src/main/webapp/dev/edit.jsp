<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h2>Edit Form</h2>
<form action="update" method="post">
<input type="hidden" name="id" value="${data.id}"><br> 
<input type="text" name="name" value="${data.name}"><br>
<input type="text" name="email" value="${data.email}"><br>
<input type="text" name="roll_number" value="${data.roll_number}"><br> 
<input type="text" name="dept" value="${data.dept}"><br>
<input type="submit" value="Update">
</form>
</center>
</body>
</html>