<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/21
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function init() {
            document.form1.username.focus();
        }
    </script>
</head>
<body onload="init()">
    <table align="center" width="450" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td height="80">
                <img src="${pageContext.request.contextPath}/img/usr/user/login/title.jpeg">
            </td>
        </tr>
        <tr>
            <td align="center">
                    <s:form id="form1" name="form1" action="login" namespace="/usr/user" target="_top" method="POST" theme="simple">
                        <table border="0" align="center">
                            <tr align="center">
                                <td colspan="2">
                                    <strong>请登录</strong>
                                </td>
                            </tr>
                            <tr align="center">
                                <td colspan="2">
                                    <s:actionerror />
                                    <s:fielderror />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <font color="000F60"><strong>用户名：</strong></font>
                                </td>
                                <td>
                                    <s:textfield name="username" id="username" cssClass="text" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <font color="000F60"><strong>密码：</strong></font>
                                </td>
                                <td>
                                    <s:password name="password" id="password" cssClass="password-field" showPassword="true" />
                                </td>
                            </tr>
                            <tr align="center">
                                <td colspan="2">
                                    <s:reset name="reset" value="取消" cssClass="button" />
                                    <s:submit name="submit" value="登录" cssClass="button" />
                                </td>
                            </tr>
                        </table>
                    </s:form>
            </td>
        </tr>
    </table>
</body>
</html>
