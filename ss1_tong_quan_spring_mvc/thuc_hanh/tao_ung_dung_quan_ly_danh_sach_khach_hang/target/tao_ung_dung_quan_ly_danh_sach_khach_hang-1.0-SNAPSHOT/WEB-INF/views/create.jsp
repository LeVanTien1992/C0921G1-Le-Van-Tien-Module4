
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/customer/save" method="post" >
    <label >ID:</label><br>
    <input type="text"  name="id" ><br>
    <label >Name:</label><br>
    <input type="text"  name="name"><br><br>
    <label >Email:</label><br>
    <input type="text"  name="email" ><br><br>
    <label >Address:</label><br>
    <input type="text"  name="address" ><br><br>
    <input type="submit" value="Create Customer">
</form>