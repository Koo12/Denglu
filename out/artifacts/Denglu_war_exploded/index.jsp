<%--
  Created by IntelliJ IDEA.
  User: koo12-lenovo
  Date: 18-3-19
  Time: 下午4:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>欢迎来到登录界面</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
  </head>
  <body>
  <center>
    <form action="deng" method="post">
      <div name="tablerow">
        <p>
          名称：
        </p>
        <p>
          <input type="text" name="yonghuming">
        </p>
      </div>
      <div name="tablerow">
        <p>
          密码：
        </p>
        <p>
          <input type="password" name="mima">
        </p>
      </div>
      <div name="tablerow" id="tiao">
        <p>
          <a href="xinxiluru.jsp">没有帐号？</a>
        </p>
        <p>
          <input type="submit" value="登录">
        </p>
      </div>
    </form>
  </center>
  </body>
</html>
