<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/20
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.ynu.dto.Goodstype" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Sucess</title>
</head>
<body>
操作成功!
<meta http-equiv="refresh" content="2;url=http://localhost:8080/webtest/showGoodsType?gt_id=${gt_id}" />
</body>
</html>
