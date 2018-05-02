<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SolutionDetails</title>
</head>
<body>

<%@ include file="header.jsp" %>

<p> Solution Details: </p>

<table>
    <tr><th>ID</th><th>DESCRIPTION</th><th>CREATED</th></tr>
    <tr>
        <td> <c:out value="${solution.id}"/></td></br>
        <td> <c:out value="${solution.description}"/></td></br>
        <td> <c:out value="${solution.created}"/></td></br>
    </tr>
</table>
</body>
</html>
