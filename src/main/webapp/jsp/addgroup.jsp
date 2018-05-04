<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Group</title>
</head>
<body>
<h2>New Group:</h2>

    <form action ="/addgroup" method="POST">
        <label> Name:
            <input type ="text" name ="name"/>
        </label><br>
        <input type ="submit" value="Save"/>
    </form>
</body>
</html>
