<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Group Edition</title>
</head>
<body>
<p>Edit Group:</p>
    <form action ="/editgroup" method="POST">
        <label>New Group name:
        <input type ="text" name ="name"/>
        </label><br>
        <input type ="submit" value="Save"/>
    </form>
</body>
</html>
