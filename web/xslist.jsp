<%--
  Created by IntelliJ IDEA.
  User: liguangdong
  Date: 2019/2/18
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        function toadd(){
            location="xuesheng.html";
        }
    </script>
</head>
<body>
<table border="1" cellspacing="0">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>年级</td>
        <td>学科</td>
    </tr>

    <c:forEach var="xueSheng" items="${xslist}">
        <tr>
            <td>${xueSheng.xsname}</td>
            <td>${xueSheng.xsage}</td>
            <td>${xueSheng.xsnianji}</td>
            <td>${xueSheng.xueke}</td>
        </tr>
    </c:forEach>

    <input type="button" value="继续添加" onclick="toadd()">
</table>
</body>
</html>
