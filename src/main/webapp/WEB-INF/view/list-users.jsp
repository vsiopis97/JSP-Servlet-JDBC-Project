<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>Display Users</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/list-users.css">
</head>

<body>
	<div align="center">
		<div id="wrapper">
			<div id="header">
				<h2>List of Users</h2>
			</div>
		</div>

		<div id="container">
			<div id="content">
				<table>
					<tr>
						<th>First Name</th>
						<th>Surname</th>
						<th>Details</th>
					</tr>

					<c:forEach var="user" items="${users}">

						<c:url var="userDetailsLink" value="/user/details">
							<c:param name="userId" value="${user.id}" />
						</c:url>
						<tr>
							<td>${user.firstName}</td>
							<td>${user.surname}</td>
							<td><a href="${userDetailsLink}" target="_blank"
								rel="noopener noreferrer">Show more</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		<br>
		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}">Back to Home</a>
		</p>
	</div>

</body>

</html>