<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
<div class="container">
    <form method="post" action="${website}login">
        <div class="input-group">
            <input type="text" class="user-info user-name J_phone" placeholder="手机号" name="phone">
            <input type="password" class="user-info J_password" placeholder="密码" name="password">
        </div>
    </form>
    <button class="login-btn J_login" type="button">登录</button>
    <a href="${website}register" class="register">立即注册</a>
    <a href="${website}forgot" class="register right">找回密码</a>
</div>
</body>
</html>
