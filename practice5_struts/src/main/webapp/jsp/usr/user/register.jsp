<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/20
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        session.setAttribute("token", token);
    %>
    <form action="${pageContext.request.contextPath}/usr/user/register" method="post">
        <input type="hidden" name="token" value="<%=token%>">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="submit" value="注册"><br>
    </form>
</body>
</html>
