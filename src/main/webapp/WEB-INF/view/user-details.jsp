<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>
<title>User Details</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/user-details.css">
</head>

<body>
	<div align="center">
		<div id="wrapper">
			<div id="header">
				<h2>Chosen user: ${user.firstName} ${user.surname}</h2>
			</div>
		</div>

		<div id="container">
			<div id="content">
				<form:form action="" modelAttribute="user" method="POST"></form:form>
				<table>
					<tr>
						<th>First Name</th>
						<th>Surname</th>
						<th>Gender</th>
						<th>Date of Birth</th>
						<th>Work Address</th>
						<th>Home Address</th>
					</tr>

					<tr>
						<td>${user.firstName}</td>
						<td>${user.surname}</td>
						<td>${user.gender}</td>
						<td>${user.birthdate}</td>
						<td>${user.address.workAddress}</td>
						<td>${user.address.homeAddress}</td>
					</tr>
				</table>
			</div>

		</div>
	</div>
</body>

</html>