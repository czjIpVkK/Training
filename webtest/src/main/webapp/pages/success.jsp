<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录成功~

     <p>欢迎您
         <%=request.getSession().getAttribute("sessionname")%>
         !
     </p>
    <%
        if (request.getSession().getAttribute("type") == "user") {
    %>
<form action="/webtest/UserDetails" method="POST">
    <input name="userName" type="hidden" class="form-control" value="<%=request.getSession().getAttribute("sessionname")%>">
    <button type="submit" class="btn btn-default">更改用户信息</button>
</form>
    <%
        }
        else{
    %>
<form action="/webtest/showGoodsType" method="GET">
    <input name="gt_id" type="hidden" value="0">
    <button type="submit" class="btn btn-default">管理商品类型</button>
</form>
<form action="/webtest/showgoods" method="GET">
    <button type="submit" class="btn btn-default">管理商品</button>
</form>
<form action="/webtest/showuser" method="GET">
    <button type="submit" class="btn btn-default">管理用户</button>
</form>
<%
    }
%>



</body>
</html>
