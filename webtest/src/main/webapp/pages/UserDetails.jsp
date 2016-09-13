<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/7
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <title>会员信息编辑</title>
</head>
<body>

    <form action="UpdateUserDetails" method="POST">
            <input  name="u_id" type="text" class="form-control" value=${u_id}>
            <input  name="u_name" type="text" class="form-control" value=${u_name}>
            <input  name="ut_id" type="text" class="form-control" placeholder="用户种类" value=${ut_id}>
            <input  name="u_birthday" type="date" class="form-control" placeholder="生日" value=${u_birthday}>
            <!--input  name="u_Gender" type="password" class="form-control"  placeholder="性别"-->
            <p>性别</p>
            <select name="u_gender">
                <option value=1>男</option>
                <option value=0>女</option>
            </select>
            <input  name="u_description" type="text" class="form-control"  placeholder="个人介绍" value=${u_description}>
            <input  name="u_credits" type="text" class="form-control"  placeholder="积分" value=${u_credits}>
            <input  name="u_balance" type="text" class="form-control"  placeholder="打折" value=${u_balance}>
            <button type="submit" class="btn btn-default">确认更改</button>
    </form>

</body>
</html>
