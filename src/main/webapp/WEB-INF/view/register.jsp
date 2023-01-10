<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register New User</title>

</head>
<body>
	<div align="center">
		<p>Please fill all the mandatory fields before submitting.</p>

		<form:form action="saveUser" modelAttribute="user" method="POST">

			<table>

				<tbody>

					<tr>
						<td>Name:</td>
						<td><input type="text" name="firstName" value="" size="50"
							required /></td>
					</tr>
					<tr>
						<td>Surname:</td>
						<td><input type="text" name="surname" value="" size="50"
							required /></td>
					</tr>
					<tr>
						<td>Gender:</td>
						<td><select name="gender" required>
								<option value="">--Please select a category--</option>
								<option value="M">M</option>
								<option value="F">F</option>
						</select></td>
					</tr>

					<tr>
						<td>Birthdate:</td>
						<td><input type="date" name="birthdate" value="" size="50"
							required /></td>
					</tr>
					<tr>
						<td>Work Address:</td>
						<td><textarea name="workAddress"></textarea></td>
					</tr>

					<tr>
						<td>Home Address:</td>
						<td><textarea name="homeAddress"></textarea></td>
					</tr>

				</tbody>

			</table>

			<input type="submit" name="Submit" value="Submit">
		</form:form>

		<div style="clear; both;"></div>

		<p>
			<a href="${pageContext.request.contextPath}">Back to Home</a>
		</p>
	</div>

</body>
</html>