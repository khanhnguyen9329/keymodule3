<%--
  Created by IntelliJ IDEA.
  User: Huongdtt
  Date: 11/8/2022
  Time: 12:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1>HONDA VIỆT NAM</h1>

<form action="/sear" method="get">
  <input type="text" name="search">
  <button type="submit">Sear</button>
  <form method="get" action="/product">


</form>

  <div class="container">

    <table class="table" border="2">
      <thead>
      <tr>
        <th>ID</th>
        <th>Tên sản phẩm</th>
        <th>Hình Ảnh</th>
        <th>Giá</th>
        <th>Số lượng</th>
        <th>Oder</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${product_user}" var="sp">
        <tr>
          <td>${sp.id}</td>
          <td>${sp.name}</td>
          <td><img src="${sp.img}" width="250" height="200"></td>
          <td>${sp.price}</td>
          <td>${sp.amount}</td>
          <td><button type="button" class="btn btn-warning">Mua hàng</button>
          </td>
        </tr>
      </c:forEach>
      </tbody>
    </table>

  </div>
</form>
</body>



</html>