
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/customer/update" method="post">
    <label >ID:</label><br>
    <input type="text"  name="id" value="${customer.id}"><br>
    <label >Name:</label><br>
    <input type="text"  name="name" value="${customer.name}"><br><br>
    <label >Email:</label><br>
    <input type="text"  name="email" value="${customer.email}"><br><br>
    <label >Address:</label><br>
    <input type="text"  name="address" value="${customer.address}"><br><br>
    <input type="submit" value="Update">
</form>