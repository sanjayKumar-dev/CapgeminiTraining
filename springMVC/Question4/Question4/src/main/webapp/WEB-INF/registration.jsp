<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/Question4/submitUser.html" method="post">
		<table>
			<tr>
				<td> UserName : </td><td> <input type="text" name="userName" /></td>
			</tr>
			
			<tr>
				<td> User Email : </td><td> <input type="text" name="userEmail" /></td>
			</tr>
			
			<tr>
				<td> User password : </td><td> <input type="text" name="userPassword" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit this form by clicking here" />
	</form>

</body>
</html>