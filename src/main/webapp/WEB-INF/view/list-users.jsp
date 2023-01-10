<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>Display Users</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>

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
				</tr>

				<c:forEach var="user" items="${users}">
					<tr>
						<td>${user.firstName}</td>
						<td>${user.surname}</td>
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
</body>

</html>