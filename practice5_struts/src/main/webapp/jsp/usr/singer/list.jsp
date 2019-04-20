<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/20
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/func.js"></script>
    <script type="text/javascript">
        function search() {
            // 1.获取XmlHttpRequest对象
            var xmlHttp = getXmlHttpRequest();
            // 2.设置回调函数
            xmlHttp.onreadystatechange = function () {
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    window.alert(xmlHttp.responseText);
                    var responseText = eval("("+xmlHttp.responseText+")");
                    for (var i=0;i<responseText.length;i++) {

                    }
                }
            };
            // 3.open
            xmlHttp.open("GET", "${pageContext.request.contextPath}/usr/singer/list");
            // 4.send
            xmlHttp.send(null);
        }
    </script>
</head>
<body>
    <input type="button" value="列表" onclick="search();">
</body>
</html>
