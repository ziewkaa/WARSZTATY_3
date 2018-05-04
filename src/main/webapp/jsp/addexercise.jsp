<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Exercise</title>
</head>
<body>
<h2>New Exercise:</h2>

    <form action ="/addexercise" method="POST">
        <label> Title:
            <input type ="text" name ="name"/>
        </label><br>
        <label> Description:
            <input type ="text" name ="description"/>
        </label><br>
        <input type ="submit" value="Save"/>
    </form>

</body>
</html>
