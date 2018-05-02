<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Group Users</title>
</head>
<body>
<h2>Participants:</h2>
<table>
    <tr><th>ID</th><th>NAME</th><th>EMAIL</th><th>DETAILS</th></tr>
    <c:forEach var="user" items="${groupUsers}">
    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.email}</td>
        <td><a href="<c:out value="/userdetails?id=${user.id}"/>">Details</a></td>
    </tr>
    </c:forEach>
</body>
</html>
