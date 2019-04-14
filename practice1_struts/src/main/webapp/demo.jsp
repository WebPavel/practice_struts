<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/14
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        application.setAttribute("aname", "avalue");
        session.setAttribute("sname", "svalue");
    %>
    <a href="${pageContext.request.contextPath}/servlet/actionContext.action?date=_&ref=index">访问demo</a>
</body>
</html>
