<%--
  Created by IntelliJ IDEA.
  User: sanqi
  Date: 2016/10/8
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页</title>
</head>
<body>
<form  action="${website}register" method="post">
    <li>
        <label>用户名（手机号）</label>
        <input class="J_phone" type="text" placeholder="您的手机号" value="${username}" name="username" />
    </li>
    <li>
        <label>输入密码</label>
        <input class="J_password"  type="password" placeholder="密码6-15位" value="${firstPsw}" name="firstPsw" />
    </li>
    <li>
        <label>确认密码</label>
        <input class="J_confirmPassword" type="password" placeholder="确认密码" value="${secondPsw}" name="secondPsw" />
    </li>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
