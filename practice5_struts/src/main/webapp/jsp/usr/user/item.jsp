<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/20
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>$的作用：在配置文件里使用ognl表达式</h2>
    <%
        request.setAttribute("username", "小樱");
        request.setAttribute("nickname", "tony");
    %>
    <s:i18n name="entity.usr.user.User">
        <s:text name="username" /><br>
        <s:text name="nickname" /><br>
    </s:i18n>
</body>
</html>
