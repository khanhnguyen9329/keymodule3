<%--
  Created by IntelliJ IDEA.
  User: Huongdtt
  Date: 11/3/2022
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/Register_Servlet">
  <h1 style="color: blue">ĐĂNG KÍ TÀI KHOẢN</h1>
<table class="color1" border="2">
  <tr>
    <td>Nhập username</td>
    <td><input type="text" name="user"></td>
  </tr>
  <tr>
    <td>Nhập pass word</td>
    <td><input type="password" name="pass"> </td>
  </tr>
  <tr>
    <td>Nhập lại pass word</td>
    <td><input type="password" name="pass1"> </td></td>
  </tr>
  <tr>
    <td>Nhập địa chỉ</td>
    <td><input type="text"name="address"></td>
  </tr>
  <tr>
    <td>Nhập ngày sinh</td>
    <td><input type="date" name="birth"></td>
  </tr>
  <tr>
    <td>role</td>
    <td><input type="number"name="role"></td>
  </tr>
  <tr>
    <td><button type="submit">Submit</button></td>
  </tr>
</table>
</form>
<%--  <a href="/account">thông tin tài khoản</a>--%>
<h1 style=color:rgba(255,0,38,0.8)>${check}</h1>
</body>
</html>
<style>
  .color1{
    color: #FFC312;

  }
  html{
    background-image:url("https://quangphuong.vn/wp-content/uploads/2017/05/xe-moto-duoc-ua-chuong-1.jpg");
    image-rendering: pixelated;
    background-size: cover;

  }
</style>