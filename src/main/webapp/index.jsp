<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
	<div align="center">
		<h2>Choose an action:</h2>
		<p>Please click a button to redirect you to the page you wish to
			go to:</p>


		<form>
			<input type="button" value="Register New User "
				onclick="window.location.href='user/register'; return false;" /> <input type="button"
				value="Display Users" onclick="window.location.href='user/list'; return false;" />
		</form>
	</div>
</body>
</html>