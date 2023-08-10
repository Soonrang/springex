<%--
  Created by IntelliJ IDEA.
  User: clear
  Date: 2023-08-10
  Time: 오후 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/todo/register" method="post">
    <div>
        Title: <input type="text" name="title">
    </div>

    <div>
        DueDate:<input type="date" name="dueDate" value="2022-12-25">
    </div>
    <div>
        <input type="text" name="writer">
    </div>
    <div>
        <input type="checkbox" name="finished">
    </div>
    <div>
        <button type="submit">등록</button>
    </div>
</form>
</body>
</html>
