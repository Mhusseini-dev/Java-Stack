<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/6/2021
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<h2>Submitted Info</h2>
<h2>Name: <c:out value="${name}"/></h2>
<h2>Dojo Location: <c:out value="${location}"/></h2>
<h2>Favorite Language: <c:out value="${language}"/></h2>
<h2>Comment: <c:out value="${comment}"/></h2>


</body>
</html>
