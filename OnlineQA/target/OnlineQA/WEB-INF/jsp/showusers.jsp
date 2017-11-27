<%--
  Created by IntelliJ IDEA.
  User: x
  Date: 2017/11/27
  Time: 下午8:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>显示用户</title>
</head>
<body>
用户id：${userinfo.id}
用户名：${userinfo.username}
密码： ${userinfo.password}
</body>
</html>
