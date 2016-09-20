
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>BackGroundLogin</title>
</head>
<body>
<div>
    <div>

        <form id="slick-login" action="/webtest/AdminLogin" method="POST" class="form-horizontal">
            <div style="color:red">${msg}</div>
            <div class="form-group">

                <label for="inputEmail3" class="col-sm-2 control-label">账1户</label>
                <div class="col-sm-10">
                    <input  name="A_name" type="text" class="form-control" id="inputEmail3" placeholder="用户名">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input  name="A_password" type="password" class="form-control" id="inputPassword3" placeholder="密码">
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
