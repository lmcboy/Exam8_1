package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>主页面</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index_style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"body_div\">\r\n");
      out.write("        <!-- 页面导航栏区域 -->\r\n");
      out.write("        <div class=\"body_title\">\r\n");
      out.write("            <nav class=\"navbar navbar-default\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <h3>8839 林免冲</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\">\r\n");
      out.write("                        <div class=\"user_style dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle user_a_style\" data-toggle=\"dropdown\"\r\n");
      out.write("                               role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                ");
      out.print( session.getAttribute("user") );
      out.write("\r\n");
      out.write("                                <span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"uerdm\">\r\n");
      out.write("                                <li role=\"presentation\">\r\n");
      out.write("                                \t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/Exit.action\" onclick=\"return confirm('确定要退出系统吗？')\">退出系统</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"img_style\"><span><img src=\"images/admin.png\"/></span></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"body_content\">\r\n");
      out.write("            <!-- 左边菜单栏区域 -->\r\n");
      out.write("            <div class=\"content_menu\">\r\n");
      out.write("                <ul class=\"nav nav-pills nav-stacked\" id=\"left_menu\">\r\n");
      out.write("\r\n");
      out.write("                    <li role=\"presentation\" class=\"active\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-default btn-lg\" onclick=\"getFirstPage()\">\r\n");
      out.write("                            Customer管理\r\n");
      out.write("                            <span class=\"flag_style\">&blacktriangleright;</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li role=\"presentation\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-default btn-lg\">\r\n");
      out.write("                            Film设置\r\n");
      out.write("                            <span class=\"flag_style\">&blacktriangleright;</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"content_main\">\r\n");
      out.write("                <!-- 数据大标题区域 -->\r\n");
      out.write("                <div class=\"main_top\">\r\n");
      out.write("                    <div class=\"main_title\">客户管理</div>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 表格标题区域 -->\r\n");
      out.write("                <div class=\"main_data\">\r\n");
      out.write("                    <table class=\"table table-bordered table-striped\">\r\n");
      out.write("                        <caption>\r\n");
      out.write("                            客户列表\r\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"button\">新建</button>\r\n");
      out.write("                        </caption>\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>操作</th>\r\n");
      out.write("                                <th>First Name</th>\r\n");
      out.write("                                <th>Last Name</th>\r\n");
      out.write("                                <th>Address</th>\r\n");
      out.write("                                <th>Email</th>\r\n");
      out.write("                                <th>CustomerID</th>\r\n");
      out.write("                                <th>Last Update</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody id=\"tbody_cusData\"></tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <!-- 分页区域 -->\r\n");
      out.write("                    <div class=\"main_page\">\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <ul class=\"pagination pagination-sm\" id=\"main_page\"></ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- 空闲区域 -->\r\n");
      out.write("                <div class=\"main_downboard\" id=\"downBoard\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 修改客户信息模态框 -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"updtCusModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("         aria-labelledby=\"updtCusModLabel\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <!-- 模态框头部区域 -->\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("                            aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <h4 class=\"modal-title\" id=\"updtCusModLabel\">修改客户信息</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 模态框身体区域 -->\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                        <div class=\"form-group input_style\">\r\n");
      out.write("                            <label for=\"fname\" class=\"control-label col-sm-3\">名字</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"fname\"\r\n");
      out.write("                                       name=\"firstName\" placeholder=\"First Name\" datasrc=\"fn\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group input_style\">\r\n");
      out.write("                            <label for=\"lname\" class=\"control-label col-sm-3\">姓氏</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"lname\"\r\n");
      out.write("                                       name=\"lastName\" placeholder=\"Last Name\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group input_style\">\r\n");
      out.write("                            <label for=\"email\" class=\"control-label col-sm-3\">邮箱</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"email\"\r\n");
      out.write("                                       name=\"eMail\" placeholder=\"Email\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group input_style\">\r\n");
      out.write("                            <label for=\"addr\" class=\"control-label col-sm-3\">地址</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <select class=\"form-control\" id=\"addr\"\r\n");
      out.write("                                        name=\"address\">\r\n");
      out.write("                                    <option>No.3119 Huston Street</option>\r\n");
      out.write("                                    <option>Timberlake Town No.2</option>\r\n");
      out.write("                                    <option>Adam Block 5</option>\r\n");
      out.write("                                    <option>Olympic 6th First Street</option>\r\n");
      out.write("                                    <option>1913 Hanoi Way</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 模态框脚步区域 -->\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <div class=\"form-group input_style\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">修改</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<script src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.cookie.js\"></script>\r\n");
      out.write("<script src=\"js/manageCustomerData.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(\"#left_menu a\").click(function(e){\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $(this).tab(\"show\");\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#updtCusModal\").on(\"show.bs.modal\",function(e){\r\n");
      out.write("        var a = $(e.relatedTarget);\r\n");
      out.write("        var s = a.data(\"whatever\");\r\n");
      out.write("        var myData = broke(s);\r\n");
      out.write("        var mod = $(this);\r\n");
      out.write("        mod.find(\"#fname\").val(myData[0]);\r\n");
      out.write("        mod.find(\"#lname\").val(myData[1]);\r\n");
      out.write("        mod.find(\"#email\").val(myData[3]);\r\n");
      out.write("        mod.find(\"#addr\").val(myData[2]);\r\n");
      out.write("    });\r\n");
      out.write("    function broke(s){\r\n");
      out.write("        return s.split(\",\");\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
