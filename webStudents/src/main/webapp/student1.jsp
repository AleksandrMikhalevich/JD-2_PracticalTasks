<%--
  Created by IntelliJ IDEA.
  User: Alex Mikhalevich
  Date: 08.05.2022
  Time: 15:56  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Info example</title>
<%--        <style>--%>
<%--            table,th,td--%>
<%--            {--%>
<%--                border:1px solid black;--%>
<%--            }--%>
<%--        </style>--%>
</head>
<body>
<h1>Student info result:</h1>
<ul>
    <%
        out.println(request.getAttribute("students"));
    %>
</ul>
<%--<table>--%>
<%--    <tr>--%>
<%--        <th>First name</th>--%>
<%--        <th>Second name</th>--%>
<%--        <th>Surname</th>--%>
<%--        <th>Faculty</th>--%>
<%--        <th>Year of study</th>--%>
<%--    </tr>--%>
<%--    <c:forEach var="student" items="${students}">--%>
<%--        <tr>--%>
<%--            <td>${student.first_name}</td>--%>
<%--            <td>${student.second_name}</td>--%>
<%--            <td>${student.surname}</td>--%>
<%--            <td>${student.faculty}</td>--%>
<%--            <td>${student.year_of_study}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
</body>
</html>
