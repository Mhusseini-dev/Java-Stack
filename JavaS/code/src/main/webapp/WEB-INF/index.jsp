<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/5/2021
  Time: 10:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><c:out value="${error}"/></h2>
<h1>What is the code?</h1>
<form action="/success" method="post">
    <p><input id="field" type="text" name="code"></p>
    <p><input id="btn" type="submit" value="Try Code"></p>
</form>
</body>
</html>
