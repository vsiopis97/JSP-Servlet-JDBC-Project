<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register New User</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/register.css">
</head>
<body>
	<div align="center">
		<div id="wrapper">
			<div id="header">
				<h2>Registration Form</h2>
			</div>
		</div>
		<br>
		<p>
			<strong>Please fill all mandatory fields before submitting <i>(*
					is mandatory)</i></strong>
		</p>
		<br>
		<form:form action="saveUser" modelAttribute="user" method="POST">

			<table>

				<tbody>

					<tr>
						<td><strong>First Name*</strong></td>
						<td><input type="text" name="firstName" value="" size="35" />
							<form:errors path="firstName" cssClass="error" /></td>
					</tr>
					<tr>
						<td><strong>Surname*</strong></td>
						<td><input type="text" name="surname" value="" size="35" />
							<form:errors path="surname" cssClass="error" /></td>
					</tr>
					<tr>
						<td><strong>Gender*</strong></td>
						<td><select name="gender">
								<option value="">--Please select a category--</option>
								<option value="M">M</option>
								<option value="F">F</option>
						</select> <form:errors path="gender" cssClass="error" /></td>
					</tr>

					<tr>
						<td><strong>Birthdate*</strong></td>
						<td><input type="date" name="birthdate" value="" size="20" />
							<form:errors path="birthdate" cssClass="error" /></td>
					</tr>
					<tr>
						<td><strong>Work Address</strong></td>
						<td><textarea name="workAddress"></textarea></td>
					</tr>

					<tr>
						<td><strong>Home Address</strong></td>
						<td><textarea name="homeAddress"></textarea></td>
					</tr>

				</tbody>

			</table>

			<input type="submit" name="Submit" value="Submit" class="button">


		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}">Back to Home</a>
		</p>
	</div>

</body>
</html>