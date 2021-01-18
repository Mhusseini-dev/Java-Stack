<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/10/2021
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<div class="container">
    <a class="btn btn-secondary" href="/new">Add a language...</a>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ languages }" var="lang">
            <tr>
                <td><a href="/${ lang.id }">${ lang.name }</a></td>
                <td>${ lang.creator }</td>
                <td>${ lang.currentVersion }</td>
                <td>
                    <a class="btn btn-secondary" href="/${ lang.id }/edit">Edit</a>
                    <form id="delete-form" action="/${lang.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <input class="btn btn-secondary" type="submit" value="Delete">
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
