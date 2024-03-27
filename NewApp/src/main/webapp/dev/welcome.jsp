<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
<h2>Welcome to Dashboard</h2>
<table border="1px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Roll Number</th>
<th>Department</th>
<th>Action</th>
</tr>

<c:forEach var="e" items="${s1}">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.email}</td>
<td>${e.roll_number}</td>
<td>${e.dept}</td>
<td>
<a href="edit?id=${e.id}">Edit</a>
<a href="del?id=${e.id}">Delete</a>
</td>
</tr>
</c:forEach>

</table>
</center>
	