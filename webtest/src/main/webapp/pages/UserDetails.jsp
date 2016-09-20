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
            <input  name="u_id" type="hidden" class="form-control" value=${u_id}>
            <td>${u_name}</td>
            <td><input  name="ut_name" type="text" class="form-control" value=${ut_name}></td>
            <td><input  name="u_birthday" type="date" class="form-control"  value=${u_birthday}></td>
            <p>性别</p>
            <select name="u_gender">
                <option value=1>男</option>
                <option value=0>女</option>
            </select>
            <input  name="u_description" type="text" class="form-control"  placeholder="个人介绍" value=${u_description}>
            <input  name="u_mobile" type="text" class="form-control"  placeholder="电话" value=${u_mobile}>
            <input  name="u_address" type="text" class="form-control"  placeholder="地址" value=${u_address}>
            <input  name="u_card_no" type="text" class="form-control"  placeholder="身份证" value=${u_card_no}>
            <p>积分</p>
            <p>${u_credits}</p>
            <p>打折</p>
            <p>${u_balance}</p>

            <button type="submit" class="btn btn-default">确认更改</button>
    </form>

</body>
</html>
