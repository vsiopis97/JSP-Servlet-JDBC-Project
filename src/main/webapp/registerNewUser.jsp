<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register New User</title>
</head>
<body>
<div align="center">
<p>Please fill all the mandatory fields before submitting.</p>

    <form name="Register User" action="register" method="post">
    
       <table>
    
          <tbody>
    
          <tr>
                <td>Name: </td>
                <td> <input type="text" name="Name" value="" size="50" required/></td>
          </tr>
          <tr>
                <td>Surname: </td>
                <td> <input type="text" name="Surname" value="" size="50" required/></td>
          </tr>
          <tr>
                 <td>Gender: </td>
                <td> <select name="Gender" required>
                        <option value="">--Please select a category--</option>
                        <option value="M">M</option>
                        <option value="F">F</option>
                     </select>
                </td>
          </tr>
          
          <tr>
                <td>Birthdate: </td>
                <td> <input type="date" name="Birthdate" value="" size="50" required/></td>
          </tr>
          <tr>
                <td>Work Address: </td>
                <td> <textarea name="Waddress"></textarea></td>
          </tr>
    
          <tr>
                <td>Home Address: </td>
                <td> <textarea name="Haddress"></textarea></td>
          </tr>
          
          </tbody>
          
       </table>
       
       <input type="submit" name="Submit" value="Submit">
       <input type="button" name="Return" value="Back" onclick="goToHome()">
    </form>
 </div>   
    <script type="text/javascript">
        function goToHome(){
           window.location = "homepage.jsp";
        }

        </script>
</body>
</html>