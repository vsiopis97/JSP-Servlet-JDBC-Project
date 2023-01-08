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
<h3>Choose an action:</h3>
  <p>Please click a button to redirect you to the page you wish to go to.</p>

    <br>

    <form>
        <input type="button" id="idname" value = "Register New User " onclick="goToReg()"/><br>
    </form>

    <br>

    <form>
        <input type="button" id="idname" value = "Display Users" onclick="goToDisp()"/><br>
    </form>
    </div>
    <script type="text/javascript">
        function goToReg(){
           window.location = "registerNewUser.jsp";
        }

        function goToDisp(){
           window.location = "displayUsers.jsp";
        }

        </script>
</body>
</html>