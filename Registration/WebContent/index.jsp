<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION </title>
</head>
<body>
<h1>Registration Form</h1>
<form action="readData.jsp"><table>

<tr><td>User id</td><td> <input type="text" name="id"></td></tr>
<tr><td>User Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Technology</td><td><input type="checkbox" name="tech_a" value="Java">Java<br>
<input type="checkbox" name="tech_b" value="C#">C#<br>
<input type="checkbox" name="tech_c" value="Angular">Angular<br>
<input type="checkbox" name="tech_d" value="Python">Python<br>
<input type="checkbox" name="tech_e" value="React">React<br>
<input type="checkbox" name="tech_f" value="AWS">AWS


</td></tr>
<tr><td>Gender</td><td><input type="radio" name="radio_a" value="Male" >Male</td><td><input type="radio" name="radio_a" value="Female"> Female</td>
</tr>
<tr><td>Qualification</td><td><select name="select"><option value="MSC">MSC</option>
<option value="BE">BE</option>
<option value="BTECH">BTECH</option>
<option value="MS">MS</option>
<option value="MBA">MBA</option>
</select>
</td></tr>
<tr><td><input type="submit" value="SUBMIT"></td><td><input type="reset" value="CLEAN"></td></tr>

</table>
</form>
</body>
</html>