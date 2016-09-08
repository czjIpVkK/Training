<%--
  Created by IntelliJ IDEA.
  User: Vivianus
  Date: 2016/9/6
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录成功~
<form action="/webtest/UserDetails" method="POST">
     <p>欢迎您
         <%=request.getSession().getAttribute("sessionname")%>
         !
     </p>
    <input name="userName" type="hidden" class="form-control" value="<%=request.getSession().getAttribute("sessionname")%>">
    <button type="submit" class="btn btn-default">更改用户信息</button>
</form>
</body>
</html>
