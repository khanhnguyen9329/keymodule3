<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="/register" method="post">
<table>
    <tr>
        <td>username</td>
        <td><input type="text" name="user"></td>
    </tr>
    <tr>
        <td>pass</td>
        <td><input type="password" name="pass"></td>
    </tr>
    <tr>
        <td>confirm pass</td>
        <td><input type="password" name="pass1"></td>
    </tr>
    <tr>
        <td><button type="submit">Đăng ký</button></td>
        <td><button type="reset">Reset</button></td>
    </tr>
</table>
</form>
</body>
</html>