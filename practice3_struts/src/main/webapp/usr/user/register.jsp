<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/15
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/usr/user/register" method="post">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        确认密码：<input type="password" name="confirmPassword"><br>
        年龄：<input type="text" name="age"><br>
        出生日期：<input type="text" name="birthday"><br>
        爱好：<input type="checkbox" name="hobby" value="basketball">篮球&nbsp;
        <input type="checkbox" name="hobby" value="running">跑步&nbsp;
        <input type="checkbox" name="hobby" value="delicious">美食<br>
        邮箱：<input type="text" name="email"><br>
        头像：<input type="text" name="avatar"><br>
        联系方式：<input type="text" name="telephone"><br>
        存款：<input type="text" name="deposit">人民币<br>
        <input type="submit" value="注册"><br>
    </form>
</body>
</html>
