

<html>
<body style="text-align: center;">
<h1>Form is Submitted Successfully</h1>
<br><br>
<h4 >${message}</h4>
<table border="3">
<tr><td>Student Name</td><td>${student.name}</td></tr>
<tr><td>Student Hobby</td><td>${student.hobby}</td></tr>
<tr><td>Student Mobile Number</td><td>${student.mobile}</td></tr>
<tr><td>Student DOB</td><td>${ student.dob}</td> </tr>
<tr><td>Student skills</td><td>${student.skills}</td></tr>
<tr><td>Student Street</td><td>${student.address.street}</td></tr>
<tr><td>Student City</td><td>${student.address.city}</td></tr>
<tr><td>Student Country</td><td>${student.address.country}</td></tr>
<tr><td>Student PinCode</td><td>${student.address.pincode}</td></tr>




</table>
</body>

</html>