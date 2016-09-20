<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.ynu.dto.User" %>
<%@page import="com.ynu.dto.Page" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <script type="text/javascript">
        function selectUser() {
            document.getElementById("pageForm").action = "selectUser.do";
            document.getElementById("pageForm").submit();
        }
        function turnUsersPage(action) {
            var total = document.getElementById("totalPage").value;
            ;
            var currentPage = document.getElementById("currentPage").value;
            currentPage = parseInt(currentPage);
            page = parseInt(currentPage);
            switch (action) {
                case 'first':
                    page = 1;
                    break;
                case 'prior':
                    page--;
                    break;
                case 'next':
                    page++;
                    break;
                case 'last':
                    page = total;
                    break;
                case 'jump':
                    page = currentPage;
                    break;
                case 'rows':
                    page = 1;
                    break;
            }
            if (page < 1) {
                page = 1;
                alert("已经到达首页");
                return;
            }
            if (page > total) {
                page = total;
                alert("已经到达末页");
                return;
            }
            document.getElementById("currentPage").value = page;
            document.getElementById("pageForm").action = "turnUsersPage.do";
            document.getElementById("pageForm").submit();
        }
    </script>
</head>

<body>
<div class="table-responsive">
    <table class="table table-striped" border="1" width="95%">
        <thead>
        <tr>
            <th>编号</th>
            <th>账号类型</th>
            <th>用户名</th>
            <th>描述</th>
            <th>生日</th>
            <th>地址</th>
            <th>余额</th>
            <th>打折</th>
            <th>性别</th>
            <th>电话</th>
            <th>禁用</th>
            <th>编辑</th>
        </tr>
        </thead>
        <form id="pageForm" method="post">
                <c:forEach var="users" items="${usersList}">
                    <tr>
                        <td>${users.u_id }</td>
                        <td>${users.ut_name }</td>
                        <td>${users.u_name }</td>
                        <td>${users.u_description }</td>
                        <td>${users.u_birthday }</td>
                        <td>${users.u_address}</td>
                        <td>${users.u_balance}</td>
                        <td>${users.u_credits}</td>
                        <td>${users.u_gender}</td>
                        <td>${users.u_mobile}</td>
                        <td>${users.u_isuse}</td>
                        <td><a href="<%=basePath%>CheckUser?userName=${users.u_name }">用户管理</a></td>
                </tr>
                </c:forEach>

            </br>
            <table>
                <tr>
                    <td align="left"><input type="button" value="首页"
                                            onclick="turnUsersPage('first')"/> <input type="button"
                                                                                 value="上一页"
                                                                                 onclick="turnUsersPage('prior')"/>
                        <input
                                type="button" value="下一页" onclick="turnUsersPage('next')"/> <input
                                type="button" value="末页 " onclick="turnUsersPage('last')"/>   <input
                                type="hidden" name="totalPage" id="totalPage"
                                value="${userpage.totalPage }"/> <input type="text" size="3"
                                                                    maxlength="5" id="currentPage"
                                                                    name="currentPage"
                                                                    value="${userpage.currentPage}"
                                                                    onkeydown="if (window.event.keyCode==13) {turnUsersPage('jump');}"/>
                        /共${userpage.totalPage }页 共${page.rowsCount }条记录   每页显示 <input
                                type="text" size="3" maxlength="5" id="rowsPerPage"
                                name="rowsPerPage" value="${userpage.rowsPerPage}"
                                onkeydown="if (window.event.keyCode==13) {turnUsersPage('rows');}"/>条记录
                    </td>
                </tr>
            </table>
        </form>
    </table>
</div>
</body>
</html>
