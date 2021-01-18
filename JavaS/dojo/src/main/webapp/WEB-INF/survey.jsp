<%--
  Created by IntelliJ IDEA.
  User: Moh
  Date: 1/6/2021
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<form action="/process" method="post">
    <h2>Your Name: <input  type="text" name="name"></h2>
    <h2>Dojo Location: <select name="location"></h2>
    <option value="Ramallah">Ramallah</option>
    <option value="Jerusalem">Jerusalem</option>
    <option value="Germany">Germany</option>
    <option value="USA">USA</option>
    </select>
    <h2>Favorite Language: <select name="language"></h2>
    <option value="Java">Java</option>
    <option value="Python">Python</option>
    <option value="C#">C#</option>
    </select>
    <h2>Comment (optional):</h2>
    <h2><input  type="textarea" name="comment"></h2>
    <h2><input  type="submit" value="Submit"></h2>
</form>

</body>
</html>
