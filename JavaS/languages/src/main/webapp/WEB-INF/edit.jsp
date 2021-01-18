<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/10/2021
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<div class="container">
    <h1>Edit Language</h1>
    <form:form action="/${ language.id }" method="post" modelAttribute="language">
        <input type="hidden" name="_method" value="put">
        <div class="form-group">
            <form:label path="name">Language Name</form:label>
            <form:errors path="name"/>
            <form:input class="form-control" path="name"/>
        </div>
        <div class="form-group">
            <form:label path="creator">Creator</form:label>
            <form:errors path="creator"/>
            <form:input class="form-control" path="creator"/>
        </div>
        <div class="form-group">
            <form:label path="currentVersion">Current Version</form:label>
            <form:errors path="currentVersion"/>
            <form:input class="form-control" path="currentVersion"/>
        </div>
        <input type="submit" value="Submit"/>
    </form:form>
</div>

</body>
</html>
