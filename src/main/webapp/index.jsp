<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/index_style.css"/>
</head>
<body>
    <div class="body_div">
        <!-- 页面导航栏区域 -->
        <div class="body_title">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <h3>8839 林免冲</h3>
                    </div>
                    <div class="collapse navbar-collapse">
                        <div class="user_style dropdown">
                            <a href="#" class="dropdown-toggle user_a_style" data-toggle="dropdown"
                               role="button" aria-haspopup="true" aria-expanded="false">
                                <%= session.getAttribute("user") %>
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu dropdown-menu-right" aria-labelledby="uerdm">
                                <li role="presentation">
                                	<a href="<%= request.getContextPath() %>/Exit.action" onclick="return confirm('确定要退出系统吗？')">退出系统</a>
                                </li>
                            </ul>

                        </div>
                        <div class="img_style"><span><img src="images/admin.png"/></span></div>
                    </div>
                </div>
            </nav>
        </div>

        <div class="body_content">
            <!-- 左边菜单栏区域 -->
            <div class="content_menu">
                <ul class="nav nav-pills nav-stacked" id="left_menu">

                    <li role="presentation" class="active">
                        <a href="#" class="btn btn-default btn-lg" onclick="getFirstPage()">
                            Customer管理
                            <span class="flag_style">&blacktriangleright;</span>
                        </a>
                    </li>

                    <li role="presentation">
                        <a href="#" class="btn btn-default btn-lg">
                            Film设置
                            <span class="flag_style">&blacktriangleright;</span>
                        </a>
                    </li>

                </ul>
            </div>

            <div class="content_main">
                <!-- 数据大标题区域 -->
                <div class="main_top">
                    <div class="main_title">客户管理</div>
                    <hr/>
                </div>
                <!-- 表格标题区域 -->
                <div class="main_data">
                    <table class="table table-bordered table-striped">
                        <caption>
                            客户列表
                            <button class="btn btn-primary" type="button">新建</button>
                        </caption>
                        <thead>
                            <tr>
                                <th>操作</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Address</th>
                                <th>Email</th>
                                <th>CustomerID</th>
                                <th>Last Update</th>
                            </tr>
                        </thead>
                        <tbody id="tbody_cusData"></tbody>
                    </table>
                    <!-- 分页区域 -->
                    <div class="main_page">
                        <nav>
                            <ul class="pagination pagination-sm" id="main_page"></ul>
                        </nav>
                    </div>
                </div>

                <!-- 空闲区域 -->
                <div class="main_downboard" id="downBoard"></div>
            </div>
        </div>
    </div>

    <!-- 修改客户信息模态框 -->
    <div class="modal fade" id="updtCusModal" tabindex="-1" role="dialog"
         aria-labelledby="updtCusModLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <!-- 模态框头部区域 -->
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="updtCusModLabel">修改客户信息</h4>
                </div>
                <!-- 模态框身体区域 -->
                <div class="modal-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group input_style">
                            <label for="fname" class="control-label col-sm-3">名字</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="fname"
                                       name="firstName" placeholder="First Name" datasrc="fn"/>
                            </div>
                        </div>
                        <div class="form-group input_style">
                            <label for="lname" class="control-label col-sm-3">姓氏</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="lname"
                                       name="lastName" placeholder="Last Name"/>
                            </div>
                        </div>
                        <div class="form-group input_style">
                            <label for="email" class="control-label col-sm-3">邮箱</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="email"
                                       name="eMail" placeholder="Email"/>
                            </div>
                        </div>
                        <div class="form-group input_style">
                            <label for="addr" class="control-label col-sm-3">地址</label>
                            <div class="col-sm-9">
                                <select class="form-control" id="addr"
                                        name="address">
                                    <option>No.3119 Huston Street</option>
                                    <option>Timberlake Town No.2</option>
                                    <option>Adam Block 5</option>
                                    <option>Olympic 6th First Street</option>
                                    <option>1913 Hanoi Way</option>
                                </select>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- 模态框脚步区域 -->
                <div class="modal-footer">
                    <div class="form-group input_style">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="submit" class="btn btn-primary">修改</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.cookie.js"></script>
<script src="js/manageCustomerData.js"></script>
<script>
    $("#left_menu a").click(function(e){
        e.preventDefault();
        $(this).tab("show");
    });
    $("#updtCusModal").on("show.bs.modal",function(e){
        var a = $(e.relatedTarget);
        var s = a.data("whatever");
        var myData = broke(s);
        var mod = $(this);
        mod.find("#fname").val(myData[0]);
        mod.find("#lname").val(myData[1]);
        mod.find("#email").val(myData[3]);
        mod.find("#addr").val(myData[2]);
    });
    function broke(s){
        return s.split(",");
    }
</script>
</body>
</html>