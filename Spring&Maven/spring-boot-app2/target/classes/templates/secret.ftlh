<!DOCTYPE html>
<html>
<head>
    <title>Secret</title>
</head>
<body>
<h1>Pssss!</h1>
<p>Keep it secret, buddy</p>

<form action="/secret" method="post">
    <input type="text" name="head" placeholder="head"/>
    <input type="text" name="body" placeholder="body"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <button type="submit">add</button>
</form>

<#if secrets??>
    <#list secrets as secret>
        <div>
            <b>${secret.id}</b>
            <i>${secret.secretHead}</i>
            <i>${secret.secretBody}</i>
        </div>
    <#else>
        <p>no secrets</p>
    </#list>
</#if>

<form action="/logout" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit" value="Sign Out"/>
</form>
</body>
</html>