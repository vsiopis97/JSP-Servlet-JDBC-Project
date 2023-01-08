<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Users</title>
</head>

<body>

<center>
<h1>List of Users</h1>
</center>

<div align="center">
<table border="1" cellpadding="5">
<tr>
   
   <th>First Name</th>
   <th>Surname</th>

</tr>

<c:forEach var="user" items="${listUser}">
<tr>
<td><c:out value="${user.firstName}" /></td>
<td><c:out value="${user.surname}" /></td>
</tr>
</c:forEach>
</table>

<input type="button" name="Return" value="Back" onclick="goToHome()">

</div>

<script type="text/javascript">

        function goToHome(){
           window.location = "homepage.jsp";
        }

        </script>
</body>
</html>