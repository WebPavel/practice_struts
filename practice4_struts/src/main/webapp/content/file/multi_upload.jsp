<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/18
  Time: 3:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:fielderror />
    <s:actionerror />
    <form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="upload"><br>
        <input type="file" name="upload"><br>
        <input type="file" name="upload"><br>
        <input type="file" name="upload"><br>
        <input type="submit" name="上传"><br>
    </form>
</body>
</html>
