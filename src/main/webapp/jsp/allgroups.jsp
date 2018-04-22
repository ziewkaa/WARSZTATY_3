<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Groups</title>
</head>
<body>

<table>
    <tr><th>ID</th><th>NAME</th><th>PARTICIPANTS</th></tr>

    <c:forEach var="group" items="${groups}">
        <tr>
            <td> <c:out value="${group.id}"/></td>
            <td> <c:out value="${group.name}"/></td>
            <td> <c:out value="/groupusers"/></td>
        </tr
    </c:forEach>
</table>


</body>
</html>
