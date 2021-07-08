<%--
  Created by IntelliJ IDEA.
  User: Xigz
  Date: 2021/7/8
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://cdn.staticfile.org/jquery/3.6.0/jquery.js"></script>
    <script>
        function click(){
            $.ajax({
                url:"getdishes",
                success:function(data){
                    $.each(data,function (index,dish) {
                        console.log(dish)
                    })
                }
            })
        }
    </script>
</head>
<body>
查看菜单
<input type="button" onclick="click()">
</body>
</html>
