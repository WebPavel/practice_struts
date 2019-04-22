<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/21
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<frameset rows="15%,*,5%">
    <frame src="${pageContext.request.contextPath}/jsp/usr/user/top.jsp" name="topFrame" noresize="noresize">
    <frameset cols="20%,*">
        <frame src="${pageContext.request.contextPath}/jsp/usr/user/left.jsp" name="leftFrame" noresize="noresize">
        <frame src="${pageContext.request.contextPath}/jsp/usr/user/welcome.jsp" name="mainFrame" noresize="noresize">
    </frameset>
    <frame src="${pageContext.request.contextPath}/jsp/usr/user/bottom.jsp" name="bottomFrame" noresize="noresize">
</frameset>
</html>