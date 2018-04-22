<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SolutionDetails</title>
</head>
<body>

<p> Solution Details: </p>

<table>
    <tr><th>ID</th></tr><tr><th>DESCRIPTION</th></tr>
    <td> <c:out value="${solution.id}"/></td></br>
    <td> <c:out value="${solution.description}"/></td></br>
</table>
</body>
</html>
