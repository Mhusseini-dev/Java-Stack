<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/10/2021
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Lookify</title>
</head>
<body>
<Div class="container">
    <div class="top">
        <a href="/songs/new"><h2 class="left">Add New</h2></a>
        <a href="/search/topten"><h2 class="left">Top Songs</h2></a>
        <div class="formright">
            <form action="/search" method="post">
                <input class="form" type="submit" value="Search Artists">
                <input class="form" type="search" name="artist" placeholder="Artist">
            </form>
        </div>
    </div>
    <table class="table table-striped table-hover table-bordered tblbrd blkbrd">
        <thead>
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Rating</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${songs}" var="song">
            <tr>
                <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
                <td><c:out value="${song.rating}"/></td>
                <td><a href="/delete/<c:out value="${song.id}"/>">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</Div>
</body>
</html>