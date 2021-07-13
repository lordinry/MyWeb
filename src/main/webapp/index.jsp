<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<body>
<h2>Hello World!</h2>

<form action="/login" method="post">
    <input type="text" name="username"/>
    <br/>
    <input type="password" name="password"/>
    <br/>
    <input type="submit" value="提交">${msg}
</form>
</body>
</html>
