<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/20
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/biz/album/add.action" method="post">
        <s:token />
        <input type="text" name="name"><br>
        <input type="text" name="author"><br>
        <input type="submit" value="添加"><br>
    </form>
</body>
</html>
