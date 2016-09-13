<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/12
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Successed</title>

    <form action="BuyGoods" method="POST">
        <input  name="g_id" type="hidden" class="form-control" value=${goods.g_id}>
        ${goods.g_name}
        <br>
        ${goods.gt_type}
        <br>
        ${goods.g_description}
        <br>
        ${goods.g_number}
        <br>
        <img src="${goods.g_pic}">
        <br>
        ${goods.g_price}
        <input  name="number" type="number" class="form-control" >
        <button type="submit" class="btn btn-default">购买</button>
    </form>

</head>
<body>

</body>
</html>
