<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>AdmissionForm</title>
</head>
<body>
	<h1 style="text-align: center;"><sp:message code="label.welcome"></sp:message> </h1>
	<h3><a href="/MVC-MultipleLanguages2/AdmissionForm?language=en">English</a>  |  <a href="/MVC-MultipleLanguages2/AdmissionForm?language=fr">French</a> </h3>

	<f:errors path="student.*" />

	<form action="/MVC-MultipleLanguages2/admission"
		method="post">
		<br>
		<h3> <sp:message code="label.FillForm"></sp:message> </h3>
		<table border="3">
			<tr>
				<td><sp:message code="label.name"></sp:message> </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><sp:message code="label.hobby"></sp:message></td>
				<td><input type="text" name="hobby"></td>
			</tr>
			<tr>
				<td><sp:message code="label.mobile"></sp:message></td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td><sp:message code="label.dob"></sp:message></td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td><sp:message code="label.skills"></sp:message></td>
				<td><select name="skills" multiple="multiple">
						<option value="java">JAVA</option>
						<option value="net">.NET</option>
						<option value="python">PYTHON</option>
						<option value="AA">Machine</option>
				</select></td>
			</tr>
		</table>
		<br>
		<h4><sp:message code="label.address"></sp:message> </h4>
		<table>
			<tr>
				<td><sp:message code="label.city"></sp:message></td>
				<td><input type="text" name="address.city"></td>
			</tr>
			<tr>
				<td><sp:message code="label.country"></sp:message></td>
				<td><input type="text" name="address.country"></td>
			</tr>
			<tr>
				<td><sp:message code="label.pincode"></sp:message></td>
				<td><input type="text" name="address.pincode"></td>
			</tr>
			<tr>
				<td><sp:message code="label.street"></sp:message></td>
				<td><input type="text" name="address.street"></td>
			</tr>
		</table>
		<input type="submit" value="Submit">
	</form>

</body>

</html>