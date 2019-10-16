<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	font-style: "italic";
	color: red;
	font-family: serif;
}

h2 {
	text-align: center;
	color: pink;
}
</style>
</head>
<body background="C:\Users\Coalesce\Desktop\cs3.jpg">
	<h2>Add Customer Details</h2>
	<form:form action="addcustomer" method="post" modelAttribute="customer">
		<form:hidden path="id" />
		<br />
		<br />
		<br />
		<br />
		<table width="20%" bgcolor="#87CEEB" align="center">
			<tr>
				<td>Enter name:</td>
				<td><form:input path="name" /> <form:errors path="name"
						class="error" /></td>
			</tr>
			<tr>
				<td>Enter address:</td>

				<td><form:input path="address" /> <form:errors path="address"
						class="error" /></td>
			</tr>
			<tr>

				<td>Enter mobile:</td>
				<td><form:input path="mobile" /> <form:errors path="mobile"
						class="error" /></td>
			</tr>
			<tr>
				<td>Enter email:</td>
				<td><form:input path="email" /> <form:errors path="email"
						class="error" /></td>
			</tr>
			<tr>
				<td>Enter salary:</td>
				<td><form:input path="salary" /> <form:errors path="salary"
						class="error" /></td>
			</tr>
			<tr>
				<td>Enter employee:</td>
				<td><form:select path="employee" items="${empList}" /> <form:errors
						path="employee" class="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>