<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:\Users\Coalesce\Desktop\cs3.jpg ">
	<style>
h4 {
	text-align: center;
	color: green;
}

h5 {
	text-align: center;
	color: green;
}

h5 {
	text-align: center;
	color: pink;
}
</style>
	<h4>WELCOME ${user.name}</h4>
	<br />
	<table border="1" width="20%" bgcolor="#87CEEB" align="center">
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>address</th>
				<th>mobile</th>
				<th>email</th>
				<th>salary</th>
				<th>employee</th>
				<th>update</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customers}" var="customer">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.name}</td>
					<td>${customer.address}</td>
					<td>${customer.mobile}</td>
					<td>${customer.email}</td>
					<td>${customer.salary}</td>
					<td>${customer.employee}</td>
					<td><a href="update?id=${customer.id}">update</a></td>
					<td><a href="delete?id=${customer.id}">delete</a></td>


				</tr>
			</c:forEach>

		</tbody>
	</table>
	<c:if test="${user.profile == 'admin' || user.profile == 'mgr'}"/>
	<h5>
		Add Customer:<a href="addcustomer">Click here</a><br />
	</h5>
	<h5>
		Logout:<a href="logout">Logout</a><br />
	</h5>
</body>
</html>