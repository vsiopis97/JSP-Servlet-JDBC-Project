<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Users</title>
</head>
<body>

<form name="Display Users" action="display" method="post">

<div>USERS HERE!</div>

<input type="button" name="Return" value="Back" onclick="goToHome()">
</form>
<script type="text/javascript">
        function goToHome(){
           window.location = "homepage.jsp";
        }

        </script>
</body>
</html>