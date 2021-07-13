<%--
  Created by IntelliJ IDEA.
  User: HUAWEI
  Date: 2021/7/12
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    欢迎你
    <%= request.getAttribute("username")%>
</body>
</html>
