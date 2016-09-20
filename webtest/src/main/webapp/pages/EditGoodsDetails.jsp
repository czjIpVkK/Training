<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/12
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.ynu.dto.Goodsinformation" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>EditGoodsDetails</title>

</head>
<body>
<form action="UpdateGoodsDetails" method="POST">
    <input  name="g_id" type="hidden" class="form-control" value=${goods.g_id}>
    <input  name="g_name" type="txt" class="form-control" value=${goods.g_name}>
    <select name="gt_id" id="slt" >
        <c:forEach var="goodsType" items="${goodstypes}">
            <option value =${goodsType.gt_id}>${goodsType.gt_name}</option>
        </c:forEach>
    </select>
    <script>
        document.getElementById("slt").value =${goods.gt_id};
    </script>
    <input  name="g_description" type="txt" class="form-control" value= ${goods.g_description}>
    <input  name="g_number" type="txt" class="form-control" value=${goods.g_number}>
    <input  name="g_pic" type="txt" accept="image/png,image/gif" value=${goods.g_pic}>
    <img src="${goods.g_pic}">
    <input  name="gs_id" type="hidden" class="form-control" value=${goods.gs_id}>
    <input  name="g_sellnumber" type="text" class="form-control" value=${goods.g_sellnumber}>
    <input  name="g_now_number" type="text" class="form-control" value=${goods.g_now_number}>
    <input  name="g_modfier" type="text" class="form-control" value=${goods.g_modfier}>
    <input  name="g_modify_time" type="date" class="form-control" value=${goods.g_modify_time}>
    <input  name="g_uper" type="text" class="form-control" value=${goods.g_uper}>
    <input  name="g_uptime" type="date" class="form-control" value=${goods.g_uptime}>
    <input  name="g_state" type="text" class="form-control" value=${goods.g_state}>
    <input  name="g_price" type="text" class="form-control" value=${goods.g_price}>
    <button type="submit" class="btn btn-default">更改</button>
</form>
</body>
</html>
