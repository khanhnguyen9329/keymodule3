<%--
  Created by IntelliJ IDEA.
  User: Huongdtt
  Date: 11/4/2022
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/edit" method="post">
<table>
    <tr>
        <td>ID</td>
        <td><input type="text" name="id" value="${account.id}" readonly></td>
    </tr>
    <tr>
        <td>username</td>
        <td><input type="text" name="user" value="${account.username}"></td>
    </tr>
    <tr>
        <td>password</td>
        <td><input type="text" name="pass" value="${account.password}"></td>
    </tr>
    <tr>
        <td>role</td>
        <td><input type="number" name="role" value="${account.id_role}"></td>
    </tr>
    <tr>
        <td><button type="submit" >Save</button></td>
    </tr>

</table>
</form>
</body>
</html>
