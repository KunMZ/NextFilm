<%--
  Created by IntelliJ IDEA.
  User: CuiH
  Date: 2016/5/14
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Logon</title>
</head>
<body>
<p>
    log on
</p>
<br/>
<form:form modelAttribute="visitor" action="/logon" method="post">
    <p>
        <label for="username">username: </label>
        <form:input type="text" id="username" path="username"
                    tabindex="1"/>
        <form:errors path="username" cssClass="error"/>
    </p>

    <p>
        <label for="password">password: </label>
        <form:input type="password" id="password" path="password"
                    tabindex="2"/>
        <form:errors path="password" cssClass="error"/>
    </p>

    <p>
        <input id="submit" type="submit" tabindex="3"
               value="Submit">
    </p>
</form:form>
<p>
    <a href="/login">log in</a>
</p>


</body>
</html>
