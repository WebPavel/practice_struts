<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/19
  Time: 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:iterator value="users" var="user">
        <s:property value="#user.username" />&nbsp;&nbsp;<s:property value="#user.profile" /><br>
    </s:iterator>
    <h2>模型驱动</h2>
    <s:property value="model.username" />&nbsp;&nbsp;<s:property value="model.profile" /><br>
    <h2>========</h2>
    <s:debug />
</body>
</html>
