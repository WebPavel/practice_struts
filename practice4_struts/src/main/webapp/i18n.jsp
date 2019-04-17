<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/16
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:i18n name="action.biz.package">
        <s:text name="initialize" />
    </s:i18n>
    <s:i18n name="language.message">
        <s:text name="navigation" />
    </s:i18n>
    <s:text name="logout" />

    <s:i18n name="action.biz.album.AlbumAction">
        <s:text name="album.singer.message">
            <s:param>周杰伦</s:param>
        </s:text>
    </s:i18n>
</body>
</html>
