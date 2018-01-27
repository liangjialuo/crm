<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>jQuery EasyUI</title>
    <%@ include file="mainHead.jsp" %>
    <script>
        $(function () {
            $('#tt').datagrid({
                url: 'datagrid_data2.json',
                title: '修改的类',
                width: 600,
                height: 300,
                fitColumns: true,
                columns: [[
                    {field: 'name', title: '类名', width: 80},
                    {field: 'role', title: '作用', width: 80},
                    {field: 'path', title: '路径', width: 80},
                    {field: 'method', title: '修改方法', width: 80},
                    {field: 'property', title: '修改属性', width: 80}

                ]],
            });
        });

    </script>
</head>
<body>
<table id="tt">
</table>
</body>
</html>