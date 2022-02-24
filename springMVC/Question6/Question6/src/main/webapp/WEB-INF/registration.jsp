<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html>

<head><style> .error{color:red} </style> </head>
<body>
<form action="registeragain" modelAttribute="customer">

<table>

<tr> 
		<td><p>Username</p></td>
		<td><input type="text" name="username"/></td>
		<form:errors path="username" cssClass="error"/>
	</tr>
		
	<tr> 
		<td><p>Email</p></td>
		<td><input type="text" name="email"/></td>
		<form:errors path="email" cssClass="error"/>
	</tr>
	
	<tr> 
		<td><p>Password</p></td>
		<td><input type="password" name="password"/></td>
		<form:errors path="password" cssClass="error"/>
	</tr>
	
	<tr> 
		<td><p>Contact</p></td>
		<td><input type="number" name="contact"/></td>
		
	</tr>
	
	<tr> 
		<td class="select">City </td>
		<td>
		<select>
		<option value="Hyderabad">Hyderabad</option>
		<option value="Bangalore">Bangalore</option>
		<option value="Pune">Pune</option>
		<option value="Mumbai">Mumbai</option>
		<option value="Chennai">Chennai</option>
		</select>
		</td>
		
	</tr>
	
	<tr> 
		<td><p>ZipCode</p></td>
		<td><input type="number" name="zip"/></td>
		<form:errors path="zip" cssClass="error"/>
	</tr>
	<form:errors path="password" cssClass="error"></form:errors>
	<form:errors path="username" cssClass="error"></form:errors>

</table>
<input type="submit" value="Register"/>





</form>

</body>
</html>