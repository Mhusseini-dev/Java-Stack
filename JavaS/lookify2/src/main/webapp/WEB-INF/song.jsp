<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/10/2021
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="top1">
        <a href="/dashboard"><h2 class="right">Dashboard</h2></a>
    </div>
    <h2>Title:  <c:out value="${song.title}"/></h2>
    <h2>Artist:  <c:out value="${song.artist}"/></h2>
    <h2>Rating (1-10):  <c:out value="${song.rating}"/></h2>
    <a href="/delete/<c:out value="${song.id}"/>"><h2>Delete</h2></a>
</div>

</body>
</html>
