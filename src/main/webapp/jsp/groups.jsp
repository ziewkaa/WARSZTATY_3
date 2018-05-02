<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h2>Groups:</h2>

<table>
    <tr><th>ID</th><th>NAME</th><th>PARTICIPANTS</th></tr>

    <c:forEach var="group" items="${groups}">
        <tr>
            <td> <c:out value="${group.id}"/></td>
            <td> <c:out value="${group.name}"/></td>
            <td> <a href="/groupusers?id=${group.id}">Details</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
