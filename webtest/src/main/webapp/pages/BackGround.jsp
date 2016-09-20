<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/17
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="utf-8">
    <title>后台管理系统</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery.min.js"></script>
    <style>
        body{
            background-image:url("F:\图片\杂项大\109.jpg");
            background-repeat:no-repeat;
        }
        .container{
            background-color:#FFF;
        }
        h1{
            font-family:Arial,Helvetica,sans-serif;
            vertical-align:middle;
            font-weight:normal;

            font-size:px}

        .btn-default{

            font-weight:bold;
            text-align:left;}


    </style>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header" >
                <img src="picture/logo.png">

            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-3 column">
            <div class="btn-group btn-group-lg btn-group-vertical">
                <button class="btn btn-default active" type="button">管理员信息</button>
                <button class="btn btn-default" type="button" onclick="location='usershow'"> 用户账号信息</button>
                <button class="btn btn-default" type="button" onClick="location='show'"> 商品信息管理</button>
                <button class="btn btn-default" type="button"> 商品类别管理</button>
                <button class="btn btn-default" type="button"> 查看留言</button>
                <button class="btn btn-default" type="button" onClick="location='sendmessage.dwt'">公告信息发布</button>
            </div>
        </div>
        <div class="col-md-9 column">
            <table class="table table-condensed table-striped">
                <tbody>
                <tr class="success">

                    <td>
                        编号
                    </td>
                    <td>
                        TB - Monthly
                    </td>
                </tr>
                <tr class="success">
                    <td>
                        用户名
                    </td>
                    <td>
                        TB - Monthly
                    </td>

                </tr>
                <tr class="success">
                    <td>
                        密码
                    </td>
                    <td>
                        TB - Monthly
                    </td>

                </tr>

            </table>
        </div>
    </div>
</div>
</body>
</html>
