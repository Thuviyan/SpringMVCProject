<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/springmvc/save" method="post"
		modelAttribute="classification">
		<h1>Enter Classification</h1>

		<br>

		<table border=1>
			
			<tr>
				<td>Classification Name:</td>
				<td><form:input path="classificationName" />
			</td>
			</tr>
		</table>
		<input type="submit" value="save" />
	</form:form>

</body>
</html>