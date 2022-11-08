<%@ taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Huongdtt
  Date: 11/4/2022
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>HONDA VIỆT NAM</h1>
<table border="2" class="account_body">
    <thead>
    <tr>
        <th>Id</th>
        <th>UserName</th>
        <th>PassWord</th>
        <th>Role</th>
        <th>Edit</th>
        <th>Delete</th>


    </tr>
    </thead>

    <tbody>
    <c:forEach items="${accounts}" var="ac">
        <tr>
            <td>${ac.id}</td>
            <td>${ac.username}</td>
            <td>${ac.password}</td>

            <td>
                <c:if test="${ac.id_role==1}">
                    Admin
                </c:if>
                <c:if test="${ac.id_role==2}">
                    User
                </c:if>
                    <%--                    ${ac.id_role}--%>
            </td>

            <td><a href="/edit?id=${ac.id}">Edit</a></td>
            <td><a href="#" onclick="showMess(${ac.id})">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
<script>
    function showMess(id) {
        let option = confirm('Bạn có thực sự muốn xóa?')
        if (option === true) {
            window.location.href = '/delete?id=' + id
        }
    }
</script>

</html>
<style>
    .account_body {
        border: chartreuse groove;
        background: #FFC312;
    }

    html {
        background-image: url("https://img.meta.com.vn/Data/image/2022/01/13/anh-dep-thien-nhien-3.jpg");
        background-size: cover;

    }
</style>