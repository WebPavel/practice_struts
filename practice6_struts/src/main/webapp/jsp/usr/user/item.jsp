<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function downloadFile(id) {
//            window.alert(id);
            window.location.href='${pageContext.request.contextPath}/usr/user/download?id='+id;
        };
    </script>
</head>
<body>
<table align="center" border="1" width="80%">
    <caption>用户详情</caption>
    <tr>
        <td>
            用户名：
        </td>
        <td>
            <s:property value="%{model.username}" />
        </td>
    </tr>
    <tr>
        <td>
            昵称：
        </td>
        <td>
            <s:property value="%{model.nickname}" />
        </td>
    </tr>
    <tr>
        <td>
            性别：
        </td>
        <td>
            <s:property value="%{model.gender}" />
        </td>
    </tr>
    <tr>
        <td>
            出生日期：
        </td>
        <td>
            <s:property value="%{model.birthday}" />
        </td>
    </tr>
    <tr>
        <td>
            联系电话：
        </td>
        <td>
            <s:property value="%{model.telephone}" />
        </td>
    </tr>
    <tr>
        <td>
            学历：
        </td>
        <td>
            <s:property value="%{model.education}" />
        </td>
    </tr>
    <tr>
        <td>
            兴趣爱好：
        </td>
        <td>
            <s:property value="%{model.hobby}" />
        </td>
    </tr>
    <tr>
        <td>
            简历下载：
        </td>
        <td>
            <a href="javascript:void(0)" target="_top" onclick="downloadFile('<s:property value="%{model.id}" />')"><s:property value="%{model.filename}" /></a>
        </td>
    </tr>
    <tr>
        <td>
            备注：
        </td>
        <td>
            <s:property value="%{model.remark}" />
        </td>
    </tr>
</table>
</body>
</html>
