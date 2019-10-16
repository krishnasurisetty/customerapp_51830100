<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE_BOOK</title>
<style type="text/css">
.error {
	font-style: italic;
	color: red;
	font-family: serif;
}
</style>

</head>
<body background="C:\Users\Coalesce\Desktop\slogin.jpg ">

	${error}

	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />

	<form:form action="login" method="post" modelAttribute="userbean">
		<table width="20%" bgcolor="#87CEEB	" align="center">
			<tr>
				<td>Enter email</td>
				<td><form:input path="email" />
					<form:errors path="email" class="error" /></td>
			</tr>
			<tr>
				<td>Enter password</td>
				<td><form:input path="password" />
					<form:errors path="password" class="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="login" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>