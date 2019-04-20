<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/19
  Time: 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:property value="categoryName" /><br>
    ${categoryName}
    <h2>获取通过push压栈的数据</h2>
    <s:property value="[0]" /><br>
    <s:property value="[0].top" /><br>
    <s:property value="[1].top" /><br>
    <h2>获取context中的数据</h2>
    <%
        request.setAttribute("rname", "rvalue");
        session.setAttribute("sname", "svalue");
        application.setAttribute("aname", "avalue");
    %>
    <s:property value="#request.rname" /><br>
    <s:property value="#session.sname" /><br>
    <s:property value="#application.aname" /><br>
    <s:property value="#attr.sname" /><br>
    <s:property value="#parameters.ref" /><br>
    <h2>遍历获取集合中的数据</h2>
    <s:iterator value="[0].top" var="category">
        <s:property value="#category.name" />&nbsp;&nbsp;<s:property value="#category.description" /><br>
    </s:iterator>
    <h2></h2>
    <s:iterator value="[0].top">
        <s:property value="name" />&nbsp;&nbsp;<s:property value="description" /><br>
    </s:iterator>
    <h2></h2>
    <s:iterator value="categories" var="category">
        <s:property value="#category.name" />&nbsp;&nbsp;<s:property value="#category.description" /><br>
    </s:iterator>
    <h2></h2>
    <s:iterator value="categories">
        <s:property value="name" />&nbsp;&nbsp;<s:property value="description" /><br>
    </s:iterator>
    <h2></h2>
    <s:iterator value="[0].top.categories" var="category">
        <s:property value="#category.name" />&nbsp;&nbsp;<s:property value="#category.description" /><br>
    </s:iterator>
    <h2></h2>
    <s:iterator value="[0].top.categories">
        <s:property value="name" />&nbsp;&nbsp;<s:property value="description" /><br>
    </s:iterator>
    <h2>数据过滤</h2>
    <s:iterator value="categories.{name}" var="categoryName">
        <s:property value="#categoryName" /><br>
    </s:iterator>
    <h2>带条件数据过滤</h2>
    <s:iterator value="categories.{?#this.sortedNumber <= 1}" var="category">
        <s:property value="#category.name" />&nbsp;&nbsp;<s:property value="#category.description" /><br>
    </s:iterator>
    <h2></h2>
    <s:iterator value="categories.{?#this.sortedNumber <= 1}.{name}" var="categoryName">
        <s:property value="#categoryName" /><br>
    </s:iterator>
    <h2>构建集合</h2>
    <s:iterator value="#{'username':'vip','vipRank':17}" var="entry">
        <s:property value="#entry.key" />&nbsp;&nbsp;<s:property value="#entry.value" /><br>
    </s:iterator>
    <h2>构建数组</h2>
    <s:iterator value="{'阿猫','阿狗','小英'}" var="element">
        <s:property value="#element" /><br>
    </s:iterator>
    <h2>结合checkbox、select使用</h2>
    <s:form>
        <s:radio list="{'男','女'}" name="gender"></s:radio>
        <s:radio list="#{'male':'男','female':'女'}" name="gender"></s:radio>
        <s:select list="{'运动','宅','工作狂'}" name="tag"></s:select>
        <s:select list="#{'apple':'苹果','orange':'橘子','banana':'香蕉'}" name="fruit"></s:select>
    </s:form>
    <h2>%的作用</h2>
    <%
        request.setAttribute("token","jwt");
    %>
    <s:property value="#request.token" default="type" /><br>
    <s:property value="%{#request.token}" /><br>
    <s:property value="%{'#request.token'}" /><br>
    <s:textfield value="#request.token" name="auth" /><br>
    <s:textfield value="%{#request.token}" name="auth" /><br>
    <s:debug />
</body>
</html>
