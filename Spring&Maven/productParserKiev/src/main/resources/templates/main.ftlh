<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
    <form action="/filter" method="post">
        <div class="form-row align-items-center">
            <div class="col-auto">
                <input type="text" name="filter" placeholder="find.." class="form-control"/>
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-primary">find</button>
            </div>
        </div>
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