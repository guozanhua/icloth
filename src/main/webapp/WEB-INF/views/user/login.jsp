<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<script type="text/javascript">
    //登录失败提示
    var login_err = '<%=request.getAttribute("login_err") == null ? "" : request.getAttribute("login_err")%>'

    if(login_err != null && login_err != '') {
        alert(login_err);
    }
</script>
<html>
<head>
    <title>登录页</title>
</head>
<body>
<div class="container">
    <form action="${website}login" method="post">
        <li>
            <label>用户名（手机号）</label>
            <input type="text" placeholder="您的手机号" value="${username}" name="username" />
        </li>
        <li>
            <label>输入密码</label>
            <input  type="password" placeholder="密码6-15位" value="${password}" name="password" />
        </li>
        <input type="submit" value="登陆"/>
    </form>
    <a href="${website}register" class="register">立即注册</a>
    <a href="${website}register" >找回密码</a>
</div>
</body>
</html>
