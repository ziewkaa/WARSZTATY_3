<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action ="/editexercise" method="POST">
    <label> Exercise ${id} Title:
        <input type ="text" name ="name"/>
    </label><br>
    <label> Description:
        <input type ="text" name ="description"/>
    </label><br>
    <input type ="submit" value="Save"/>
</form>
</body>
</html>
