<%--
  Created by IntelliJ IDEA.
  User: Huongdtt
  Date: 11/7/2022
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<a href="/account" type="button" class="btn btn-danger">Thông tin Account</a>
<form method="get" action="/product">
    <div class="container">
        <h2>Danh sách sản phẩm</h2>


        <table class="table" border="2">
            <thead>
            <tr>
                <th>ID</th>
                <th>Tên sản phẩm</th>
                <th>Hình Ảnh</th>
                <th>Giá</th>
                <th>Số lượng</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${product}" var="sp">
            <tr>
                <td>${sp.id}</td>
                <td>${sp.name}</td>
                <td><img src="${sp.img}" width="250" height="200"></td>
                <td>${sp.price}</td>
                <td>${sp.amount}</td>
               <td><button type="button" class="btn btn-secondary">Update</button></td>
              <td> <a href="#" onclick="showMess1(${sp.id})" type="button" class="btn btn-danger">Delete</a></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</form>
</body>
<script>
    function showMess1(id) {
        let option = confirm('Bạn có thực sự muốn xóa?')
        if (option === true) {
            window.location.href = '/delete_product?id' + id;
        }
    }
</script>
</html>

