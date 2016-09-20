<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.ynu.dto.Goodstype" %>
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
            function turnTypePage(action) {
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
            document.getElementById("pageForm").action = "turnTypePage.do";
            document.getElementById("pageForm").submit();
        }
        function addType(){
            document.getElementById("pageForm").action = "addTypePage.do";
            document.getElementById("pageForm").submit();
        }
    </script>
</head>

<body>
<div class="table-responsive">
    <table class="table table-striped" border="1" width="95%">
        <thead>
        <tr>
            <td>类别名</td>
            <td>类别描述</td>
            <td>父类名称</td>
            <td>类别编辑</td>
        </tr>
        </thead>
        <form id="pageForm" method="post">
                <c:forEach var="goodsType" items="${goodsTypeList}">
                    <tr>
                        <td><a href="<%=basePath%>showGoodsType?gt_id=${goodsType.gt_id }">${goodsType.gt_name }</a></td>
                        <td>${goodsType.gt_desc }</td>
                        <td><a href="<%=basePath%>showGoodsType?gt_id=${gt_father.gt_parent_id }">${gt_father.gt_name }
                        </a></td>
                        <td><a href="<%=basePath%>deleteType?gt_id=${goodsType.gt_id }&parent_id=${goodsType.gt_parent_id}">删除</a></td>
                    </tr>
                </c:forEach>
            </br>
            <table>
                <tr>
                    <td align="left"><input type="button" value="首页"
                                            onclick="turnTypePage('first')"/> <input type="button"
                                                                                 value="上一页"
                                                                                 onclick="turnTypePage('prior')"/>
                        <input type="button" value="下一页" onclick="turnTypePage('next')"/>
                        <input type="button" value="末页 " onclick="turnTypePage('last')"/>  
                        <input type="hidden" name="totalPage" id="totalPage"  value="${page.totalPage }"/>
                        <input type="text" size="3" maxlength="5" id="currentPage"
                                                                    name="currentPage"
                                                                    value="${page.currentPage}"
                                                                    onkeydown="if (window.event.keyCode==13) {turnTypePage('jump');}"/>
                        /共${page.totalPage }页 共${page.rowsCount }条记录   每页显示
                        <input type="text" size="3" maxlength="5" id="rowsPerPage"
                                name="rowsPerPage" value="${page.rowsPerPage}"
                                onkeydown="if (window.event.keyCode==13) {turnTypePage('rows');}"/>条记录
                            <input name="gt_parent_id" type="hidden" value=${gt_father.gt_id}>
                            <input name="gt_parent_name" type="hidden" value=${gt_father.gt_name}>
                            <input  type="button"  value="添加类别" onclick="addType()" />添加类别</inputbutton>
                    </td>
                </tr>
            </table>
        </form>
    </table>
</div>
</body>
</html>
