<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>Customer List</h2>
<p>
    <a href="/customer/create">
        Add new customer
    </a>
</p>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${cList}" var="c">
    <tr>
        <td><c:out value="${c.id}"/> </td>
        <td>
            <a href="/customer/${c.id}">${c.name}</a>
        </td>
        <td><c:out value="${c.email}"/> </td>
        <td><c:out value="${c.address}"/> </td>
        <td>
            <a href="/customer/update/${c.id}">Update</a>
            <a href="/customer?id=${c.id}">Delete</a>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>