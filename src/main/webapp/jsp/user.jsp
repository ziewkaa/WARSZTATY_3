<%--
  Created by IntelliJ IDEA.
  User: miauie
  Date: 22/04/2018
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <tr><th>EXERCISE ID</th><th>CREATED</th><th>DESCRIPTION</th></tr>
    <tr>
    <c:forEach var="solution" items="${solutions}">
        <td> <c:out value="${solution.exercise_id}"/></td>
        <td> <c:out value="${solution.created}"/></td>
        <td> <c:out value="${solution.description}"/></td>
    </c:forEach>
    </tr>
</table>


</body>
</html>
