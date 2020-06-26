<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/23
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/book/addBook" method="post">
        <div class="form-group">
            <label for="bkname">书籍名称</label>
            <input type="text" class="form-control" name="bookName" id="bkname" required>
        </div>
        <div class="form-group">
            <label for="bkname1">书籍数量</label>
            <input type="text" class="form-control" name="bookCount" id="bkname1" required>
        </div>
        <div class="form-group">
            <label for="bkname2">书籍描述</label>
            <input type="text" class="form-control" name="detail" id="bkname2" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control"  >
        </div>
    </form>

</div>
</body>
</html>
