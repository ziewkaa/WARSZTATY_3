<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Edit</title>
</head>
<body>
<form action ="/edituser" method="POST">
    <label> User ${id} Name :
        <input type ="text" name ="name"/>
    </label><br>
    <label> Email :
        <input type ="email" name ="email"/>
    </label><br>
    <label> Password :
        <input type ="text" name ="password"/>
    </label><br>
    <label> Group :
        <input type ="number" name ="group"/>
    </label><br>
    <input type ="submit" value="Save"/>
</form>

</body>
</html>
