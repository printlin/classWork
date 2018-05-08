<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/3
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login.action" method="post">
        <label for="username">用户名：</label><input id="username" type="text" name="username"><br>
        <label for="password">用户名：</label><input id="password" type="password" name="password"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
