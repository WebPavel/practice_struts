<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/22
  Time: 0:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        tr{
            text-align:center;
        }
    </style>
</head>
<body>
    <s:form id="form1" name="form1" action="update" namespace="/usr/user" enctype="multipart/form-data" method="POST">
        <table align="center" border="1" width="80%">
            <caption>编辑用户</caption>
            <tr align="center">
                <td colspan="2">
                    <s:actionerror />
                    <s:fielderror />
                </td>
            </tr>
            <tr>
                <td>
                    用户名：
                </td>
                <td>
                    <s:hidden id="id" name="id" value="%{model.id}" />
                    <s:textfield id="username" name="username" value="%{model.username}" cssClass="text" />
                </td>
            </tr>
            <tr>
                <td>
                    昵称：
                </td>
                <td>
                    <s:textfield id="nickname" name="nickname" value="%{model.nickname}" cssClass="text" />
                </td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td>
                    <s:password id="password" name="password" value="%{model.password}" showPassword="true" cssClass="password-field" />
                </td>
            </tr>
            <tr>
                <td>
                    性别：
                </td>
                <td>
                    <s:radio id="gender" name="gender" list="#{'male':'男','female':'女'}" value="%{model.gender}" />
                </td>
            </tr>
            <tr>
                <td>
                    出生日期：
                </td>
                <td>
                    <s:textfield id="birthday" name="birthday" value="%{model.birthday}" cssClass="text" />
                </td>
            </tr>
            <tr>
                <td>联系电话：</td>
                <td><s:textfield id="telephone" name="telephone" value="%{model.telephone}" cssClass="text" /></td>
            </tr>
            <tr>
                <td>学历：</td>
                <td>
                    <s:select id="education" name="education" list="#{'primary':'小学','junior':'初中','technical':'中专','senior':'高中','college':'专科','undergraduate':'本科','master':'硕士研究生','doctor':'博士研究生'}" headerKey="" headerValue="--选择学历--" value="%{model.education}" />
                </td>
            </tr>
            <tr>
                <td>兴趣爱好：</td>
                <td><s:checkboxlist id="hobby" name="hobby" list="#{'sleep':'睡觉','shopping':'购物','trip':'旅游','training':'健身','movie':'看电影'}" value="%{model.hobby.split(', ')}" /></td>
            </tr>
            <tr>
                <td>简历：</td>
                <td>
                    <s:property value="%{model.filename}" />
                    <s:file id="upload" name="upload" size="30" />
                </td>
            </tr>
            <tr>
                <td>备注：</td>
                <td>
                    <s:textarea id="remark" name="remark" value="%{model.remark}" cols="30" rows="3" />
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <s:submit id="submit" value="保存" />
                    <input type="button" value="取消，返回" onclick="history.go(-1)">
                </td>
            </tr>
        </table>
    </s:form>
</body>
</html>
