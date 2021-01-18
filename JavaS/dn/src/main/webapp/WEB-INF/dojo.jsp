<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/15/2021
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/main.css">
    <title>Title</title>
</head>
<body>
<div id="container">
    <div id="leftpanel">
        <h1>New Dojo</h1>
        <form:form action="/adddojo" method="post" modelAttribute="dojoObject">
            <h2>
                <form:label cssClass="label left" path="name">Name:</form:label>
                <form:input cssClass="box" path="name"/>
            </h2>
            <input id="btn" type="submit" value="Create"/>
        </form:form>
    </div>
    <div id="rightpanel">
        <form:errors cssClass="red" path="dojoObject.*"/>
    </div>
</div>

</body>
</html>
