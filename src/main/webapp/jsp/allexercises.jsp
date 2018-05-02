<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Exercises</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h2>Exercises Management:</h2>

<table>
    <tr><th>ID</th><th>TITLE</th><th>ACTION</th></tr>

    <c:forEach var="exercise" items="${exercises}">
        <tr>
            <td> <c:out value="${exercise.id}"/></td>
            <td> <c:out value="${exercise.title}"/></td>
            <td> <a href="/editexercise?id=${exercise.id}">Edit</a> / <a href="/deleteexercise?id=${exercise.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
