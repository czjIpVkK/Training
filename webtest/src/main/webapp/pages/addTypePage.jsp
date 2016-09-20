<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/20
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.ynu.dto.Goodstype" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>新增类别</title>


</head>
<body>

<form  action="addType"  method="POST">
    <input name="gt_parent_id" type="hidden" value=${gt_parent_id}>
    <input name="gt_parent_name" type="hidden" value=${gt_parent_name}>
    描述:<input name="gt_desc" type="text" >
    名称:<input name="gt_name" type="text" >
    可见:<input name="gt_isvisible" type="text" >
    <button type="submit" >添加类别</button>
</form>
</body>
</html>
