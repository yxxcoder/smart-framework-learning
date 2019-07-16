<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>客户管理 - 创建客户</title>
</head>
<body>

<h1><a href="${BASE}/">首页</a> / <a href="${BASE}/customer">客户管理</a> / 创建客户</h1>

<div id="customer_form">
    <table>
        <tr>
            <td>客户名称：</td>
            <td>
                <input type="text" name="name" value="${customer.name}">
            </td>
        </tr>
        <tr>
            <td>联系人：</td>
            <td>
                <input type="text" name="contact" value="${customer.contact}">
            </td>
        </tr>
        <tr>
            <td>电话号码：</td>
            <td>
                <input type="text" name="telephone" value="${customer.telephone}">
            </td>
        </tr>
        <tr>
            <td>邮箱地址：</td>
            <td>
                <input type="text" name="email" value="${customer.email}">
            </td>
        </tr>
    </table>
    <button type="submit">保存</button>
</div>

<script src="${BASE}/asset/lib/jquery/jquery.min.js"></script>
<script src="${BASE}/asset/lib/jquery-form/jquery.form.min.js"></script>
<script>
    $(document).ready(function () {
        $("button").click(function () {
            $.post("${BASE}/customer_create", {
                    name: $("input[name='name']").val(),
                    contact: $("input[name='contact']").val(),
                    telephone: $("input[name='telephone']").val(),
                    email: $("input[name='email']").val()
                },
                function (data, status) {
                    location.href = '${BASE}/customer';
                });
        });
    });
</script>

</body>
</html>