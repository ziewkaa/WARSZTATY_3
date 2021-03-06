<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ include file="header.jsp" %>
<table>
<h2>Recent solutions:</h2>

    <tr><th>Title</th><th>Author</th><th>Added</th><th>Details</th></tr>

    <c:forEach var="solution" items="${solutions}">
        <tr>
            <td> <c:out value="${solution.title}"/></td></br>
            <td> <c:out value="${solution.user_id}"/></td></br>
            <td> <c:out value="${solution.updated}"/></td></br>
            <td><a href="/solution?id=${solution.id}"> Details </a></td>
        </tr
    </c:forEach>
    </table>

<%@ include file="footer.jsp" %>
</body>
</html>
