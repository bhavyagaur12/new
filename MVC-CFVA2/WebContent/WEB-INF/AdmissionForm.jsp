<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>AdmissionForm</title>
</head>
<body>
	<h1 style="text-align: center;">WELCOME</h1>

	<f:errors path="student.*" />

	<form action="/MVC-CFVA2/admission"
		method="post">
		<br>
		<h3>Please fill out the below form</h3>
		<table border="3">
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Student Hobbies</td>
				<td><input type="text" name="hobby"></td>
			</tr>
			<tr>
				<td>Student Mobile Number</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Student DOB</td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td>Student Skills</td>
				<td><select name="skills" multiple="multiple">
						<option value="java">JAVA</option>
						<option value="net">.NET</option>
						<option value="python">PYTHON</option>
						<option value="AA">Machine</option>
				</select></td>
			</tr>
		</table>
		<br>
		<h4>Student Address</h4>
		<table>
			<tr>
				<td>City</td>
				<td><input type="text" name="address.city"></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><input type="text" name="address.country"></td>
			</tr>
			<tr>
				<td>PinCode</td>
				<td><input type="text" name="address.pincode"></td>
			</tr>
			<tr>
				<td>Street</td>
				<td><input type="text" name="address.street"></td>
			</tr>
		</table>
		<input type="submit" value="Submit">
	</form>

</body>

</html>