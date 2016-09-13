<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.ynu.dto.Goodsinformation" %>
<%@page import="com.ynu.dto.Page" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: Vivianus
  Date: 2016/9/12
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
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
        function turnPage(action) {
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
            document.getElementById("pageForm").action = "turnPage.do";
            document.getElementById("pageForm").submit();
        }
    </script>
</head>

<body>
<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>LastName</th>
            <th>FirstName</th>
            <th>Email</th>
            <th>AddressId</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        </thead>
        <form id="pageForm" method="post">
            <table border="1" width="95%">
                <c:forEach var="goods" items="${goodsList}">
                    <tr>
                        <td>${goods.g_id }</td>
                        <td>${goods.gt_type }</td>
                        <td>${goods.g_name }</td>
                        <td>${goods.g_description }</td>
                        <td><img src="${goods.g_pic }"></td>
                        <td><a href="<%=basePath%>GoodsDetails?g_id=${goods.g_id }">商品详情</a></td>
                    </tr>
                </c:forEach>
            </table>
            </br>
            <table>
                <tr>
                    <td align="left"><input type="button" value="首页"
                                            onclick="turnPage('first')"/> <input type="button"
                                                                                 value="上一页"
                                                                                 onclick="turnPage('prior')"/>
                        <input
                                type="button" value="下一页" onclick="turnPage('next')"/> <input
                                type="button" value="末页 " onclick="turnPage('last')"/>   <input
                                type="hidden" name="totalPage" id="totalPage"
                                value="${page.totalPage }"/> <input type="text" size="3"
                                                                    maxlength="5" id="currentPage"
                                                                    name="currentPage"
                                                                    value="${page.currentPage}"
                                                                    onkeydown="if (window.event.keyCode==13) {turnPage('jump');}"/>
                        /共${page.totalPage }页 共${page.rowsCount }条记录   每页显示 <input
                                type="text" size="3" maxlength="5" id="rowsPerPage"
                                name="rowsPerPage" value="${page.rowsPerPage}"
                                onkeydown="if (window.event.keyCode==13) {turnPage('rows');}"/>条记录
                    </td>
                </tr>
            </table>
        </form>
    </table>
</div>
</body>
</html>
