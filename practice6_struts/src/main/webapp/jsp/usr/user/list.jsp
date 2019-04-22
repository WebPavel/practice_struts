<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/22
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <s:form id="form1" name="form1" action="listByCond" namespace="/usr/user" method="POST" theme="simple">
    <table width="80%" border="1" align="center">
        <caption>条件查询</caption>
        <tr>
            <td>用户名：</td><td><s:textfield id="username" name="username" cssClass="text" /></td>
            <td>性别：</td><td><s:select id="gender" name="gender" list="#{'male':'男','female':'女'}" headerKey="" headerValue="--选择性别--" /></td>
        </tr>
        <tr>
            <td>学历：</td><td><s:select id="education" name="education" list="#{'primary':'小学','junior':'初中','technical':'中专','senior':'高中','college':'专科','undergraduate':'本科','master':'硕士研究生','doctor':'博士研究生'}" headerKey="" headerValue="--选择学历--" /></td>
            <td>是否上传简历：</td><td><s:select id="isUpload" name="isUpload" list="#{'0':'无','1':'有'}" headerKey="" headerValue="--请选择--" /></td>
        </tr>
        <tr align="right">
            <td colspan="2">
                <s:submit id="listBy" name="listBy" value="查询" cssClass="button" />
                <s:reset id="reset" name="reset" value="重置" cssClass="button" />
            </td>
        </tr>
    </table>
    </s:form>
</div>
<div align="right"><a href="${pageContext.request.contextPath}/jsp/usr/user/edit.jsp">添加用户</a></div>
<div>
    <table width="80%" border="1" align="center">
        <caption>用户列表</caption>
        <tr>
            <th>用户名</th>
            <th>昵称</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>联系电话</th>
            <th>学历</th>
            <th>兴趣爱好</th>
            <th>编辑</th>
            <th>查看</th>
            <th>删除</th>
        </tr>
        <s:iterator value="%{users}" var="user">
            <tr align="center">
                <td><s:property value="#user.username" /></td>
                <td><s:property value="#user.nickname" /></td>
                <td><s:property value="#user.gender" /></td>
                <td><s:property value="#user.birthday" /></td>
                <td><s:property value="#user.telephone" /></td>
                <td><s:property value="#user.education" /></td>
                <td><s:property value="#user.hobby" /></td>
                <td>
                    <s:a action="edit" namespace="/usr/user">
                        <s:param name="id" value="%{#user.id}" />
                        编辑
                    </s:a>
                </td>
                <td>
                    <s:url action="findById" namespace="/usr/user" var="findByIdUrl">
                        <s:param name="id" value="%{#user.id}" />
                    </s:url>
                    <s:a href="%{#findByIdUrl}">
                        查看详情
                    </s:a>
                </td>
                <td>
                    <s:url action="del" namespace="/usr/user" var="delUrl">
                        <s:param name="id" value="%{#user.id}" />
                    </s:url>
                    <s:a href="%{#delUrl}">
                        删除
                    </s:a>
                </td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
