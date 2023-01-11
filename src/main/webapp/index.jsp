<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style3.css">
</head>
<body>
	<div align="center">

		<div id="wrapper">
			<div id="header">
				<h2>Home</h2>
			</div>
		</div>
		<br> <br>
		<p>Please click a button to redirect you to the page you wish to
			go to:</p>
		<br> <br>
		<form>
			<input type="button" value="Register New User "
				onclick="window.location.href='user/register'; return false;"
				class="button" /> <input type="button" value="Display Users"
				onclick="window.location.href='user/list'; return false;"
				class="button" />
		</form>
	</div>
</body>
</html>