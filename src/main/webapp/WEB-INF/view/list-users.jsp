<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<br>
		<form:form action="search" method="GET">
                Search user: <input type="text" name="searchName" />
			<input type="submit" value="Search" />
			<input type="button" value="Reset List" onclick="window.location.href = 'http://localhost/EDWebApplication/user/list'" />
		</form:form>
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