<%--
  Created by IntelliJ IDEA.
  User: miauie
  Date: 22/04/2018
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>allusers</title>
</head>
<body>
<table>
    <tr><th>ID</th><th>USERNAME</th></tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td> <c:out value="${user.id}"/></td>
            <td> <c:out value="${user.username}"/></td>
            <td> <c:out value="/user"/></td>
        </tr
    </c:forEach>
</table>

</body>
</html>
