<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/21
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td>
                <img src="${pageContext.request.contextPath}/img/usr/user/top/logo.jpeg">
            </td>
            <td align="right">
                用户名：<font color="blue">${user.nickname}</font>
            </td>
            <td align="left">
                <img src="${pageContext.request.contextPath}/img/usr/user/top/button_exit.gif">
            </td>
        </tr>
    </table>
</body>
</html>
