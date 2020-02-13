<!DOCTYPE html>
<html>
<head>
    <title>Spring Security Example </title>
</head>
<body>
<#if RequestParameters.error??>
    <div>
        <strong>Invalid Login!</strong><br>Invalid username or password
    </div>
<#elseif RequestParameters.logout??>
    <div>
        <strong>Logged out!</strong>
    </div>
</#if>
<form action="/login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><label> User Name : <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form>
<a href="/registration">Registration</a>
</body>
</html>