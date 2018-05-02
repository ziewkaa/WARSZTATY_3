<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>allusers</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h2>Users Management:</h2>

<table>
    <tr><th>ID</th><th>USERNAME</th><th>ACTION</th></tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td> <c:out value="${user.id}"/></td>
            <td> <c:out value="${user.username}"/></td>
            <td> <a href="/edituser?id=${user.id}">Edit</a> / <a href="/deleteuser?id=${user.id}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
