<%@page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
    <s:property value="'abc'.length()" />
    <h2></h2>
    <s:property value="@java.lang.Math@PI" />
</body>
</html>
