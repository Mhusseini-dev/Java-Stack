<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/5/2021
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body onload="alertPage('<c:out value="${dt}"/>')">
<h1 class=<c:out value="${ dt }"/>><c:out value="${ dtFormat }" /></h1>
<script defer type="text/javascript" src="js/main.js"></script>
</body>
</html>
