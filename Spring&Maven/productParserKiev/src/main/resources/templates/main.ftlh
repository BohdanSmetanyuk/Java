<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="/filter" method="post">
        <input type="text" name="filter" placeholder="find.." />
        <button type="submit">find</button>
    </form>
    Найдено товаров:
    <#list products as product>
        <div>
            <span>${product.name}</span>
            <span>${product.newPrice}</span>
            <span style="text-decoration: line-through">${product.oldPrice}</span>
        </div>
    </#list>
</body>
</html>