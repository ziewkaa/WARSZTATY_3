<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Groups</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h2>Groups Management:</h2>

<table>
    <tr><th>ID</th><th>NAME</th><th>ACTION</th></tr>

    <c:forEach var="group" items="${groups}">
        <tr>
            <td> <c:out value="${group.id}"/></td>
            <td> <c:out value="${group.name}"/></td>
            <td> <a href="/editgroup?id=${group.id}">Edit</a> / <a href="/deletegroup?id=${group.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
