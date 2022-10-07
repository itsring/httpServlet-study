<%--
  Created by IntelliJ IDEA.
  User: ki612
  Date: 2022-10-07
  Time: 오후 7:20
  To change this template use File | Settings | File Templates.
--%>
<%--jsp 파일임을 알려주는 줄--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    username: <input type="text" name="username" />
    age:      <input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>
