<%--
  Created by IntelliJ IDEA.
  User: Vivianus
  Date: 2016/9/6
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>123</title>
</head>
<body>
<div>
    <div>

        <form id="slick-login" action="/webtest/logins" method="POST" class="form-horizontal">
            <div style="color:red">${msg}</div>
            <div class="form-group">

                <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-10">
                    <input  name="u_name" type="text" class="form-control" id="inputEmail3" placeholder="用户名">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input  name="pass" type="password" class="form-control" id="inputPassword3" placeholder="密码">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">登录</button>
                </div>
            </div>
        </form>

    </div>
</div>
</body>
</html>
