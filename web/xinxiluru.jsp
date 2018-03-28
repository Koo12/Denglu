<%--
  Created by IntelliJ IDEA.
  User: koo12-lenovo
  Date: 18-3-19
  Time: 下午4:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>信息填写</title>
    <link type="text/css" rel="stylesheet" href="css/xinxiluru.css">
</head>
<body>
    <center>
        <form action="zhu" method="post">
            <div name="tablerow">
                <p>
                    昵称：
                </p>
                <p>
                    <input type="text" name="nicheng" required>
                </p>
            </div>
            <div name="tablerow">
                <p>
                    密码：
                </p>
                <p>
                    <input type="password" name="mima" required>
                </p>
            </div>
            <div name="tablerow">
                <p>
                    确认：
                </p>
                <p>
                    <input type="password" name="queren" required>
                </p>
            </div>
            <div name="tablerow">
                <p>
                    姓名：
                </p>
                <p>
                    <input type="text" name="xingming">
                </p>
            </div>
            <div name="tablerow">
                <p>
                    年龄：
                </p>
                <p>
                    <input type="number" name="nianling" min="0">
                </p>
            </div>
            <div name="tablerow">
                <p>
                    性别：
                </p>
                <p>
                    <input type="radio" name="dan" value="boy">男
                    <input type="radio" name="dan" value="girl">女
                </p>
            </div>
            <div name="tablerow">
                <p>
                    签名：
                </p>
                <p>
                    <input type="text" name="qianming">
                </p>
            </div>
            <div name="tablerow">
                <p>
                    <input type="submit" value="确定">
                </p>
            </div>
        </form>
    </center>
</body>
</html>
