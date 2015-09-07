<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/login_style.css"/>
</head>
<body>
    <div class="body_div">
        <div class="title_div">
            <h3>8839 林免冲</h3>
        </div>
        <div class="content_div">
            <form class="form-horizontal" action="Login.action" 
            	method="post" name="login_form">
                <div class="form_title">
                    <p><h4>电影租赁管理系统</h4></p>
                    <hr/>
                </div>
                <div class="form-group input_style">
                    <label for="uname" class="control-label col-sm-3">用户名</label>
                    <input type="text" class="form-control col-sm-9" id="uname" name="username"/>
                </div>
                <div class="form-group input_style">
                    <label for="pswd" class="control-label col-sm-3">密码</label>
                    <input type="password" class="form-control col-sm-9" id="pswd" name="password"/>
                </div>
                <div class="form-group input_style">
                    <button type="submit" class="btn btn-primary btn-md">登录</button>
                </div>
                <%if(request.getAttribute("msg") != null 
                	&& !request.getAttribute("msg").toString().trim().equals("")){ %>
                <div class="form_footer">
                    <p><%= request.getAttribute("msg") %></p>
                </div>
                <%} %>
            </form>
        </div>
    </div>
</body>
</html>