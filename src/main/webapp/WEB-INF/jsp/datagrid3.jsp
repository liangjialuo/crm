<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>jQuery EasyUI</title>
    <%@ include file="mainHead.jsp" %>
    <script>
        $(function () {
            $('#tt').datagrid({
                url: 'ddd.json',
                title: 'DataGrid - ContextMenu',
                width: 600,
                height: 300,
                fitColumns: true,
                columns: [[
                    {field: 'itemid', title: '类名', width: 80},
                    {field: 'productid', title: '作用', width: 100},
                    {field: 'listprice', title: '路径', width: 80},
                    {field: 'unitcost', title: '修改方法', width: 80},
                    {field: 'attr1', title: '修改属性', width: 150}
                ]],

            });
        });


    </script>
</head>
<body>
<h1>DataGrid - ContextMenu</h1>
<p>Right click the header of datagrid to show context menu.</p>

<table id="tt"></table>

</body>
</html>