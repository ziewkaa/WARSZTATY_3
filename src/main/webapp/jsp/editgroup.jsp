<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Group  Edition</title>
</head>
<body>
<%@ include file="header.jsp" %>
<p>Edit Group ${id}:</p>
    <form action ="/editgroup" method="POST">
        <label> Group name:
        <input type ="text" name ="name"/>
        </label><br>
        <input type ="submit" value="Save"/>
    </form>
</body>
</html>
