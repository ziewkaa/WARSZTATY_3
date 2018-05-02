<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>User Details:</p>
<table>
    <tr><th>ID</th><th>USERNAME</th><th>EMAIL</th></tr>
        <tr>
            <td> <c:out value="${user.id}"/></td>
            <td> <c:out value="${user.username}"/></td>
            <td> <c:out value="${user.email}"/></td>
        </tr>
</table>


<p>User Solutions:</p>
<table>
    <tr><th>EXERCISE ID</th><th>TITLE</th><th>DESCRIPTION</th></tr>
    <tr>
    <c:forEach var="solution" items="${solutions}">
        <td> <c:out value="${solution.exercise_id}"/></td>
        <td> <c:out value="${solution.title}"/></td>
        <td> <c:out value="${solution.description}"/></td>
    </c:forEach>
    </tr>
</table>


</body>
</html>
