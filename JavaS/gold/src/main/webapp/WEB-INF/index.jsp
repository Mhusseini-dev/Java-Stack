<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/8/2021
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h2><c:out value="${gold}"/></h2>
<form class="form" action="/process" method="post">
    <h2 id="location">khara</h2>
    <h3 id="desc">(earns 10-20 golds)</h3>
    <input type="hidden" name="place" value="khara">
    <button type="submit" >Find Gold!</button>
</form>
</body>
</html>
