<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/16
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/loginServlet" method="post">
    账号：<input type="text" name="username"> <br><br>
    密码：<input type="password" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
