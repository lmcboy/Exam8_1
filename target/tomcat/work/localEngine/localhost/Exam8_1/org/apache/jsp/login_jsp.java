package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>登录页面</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/login_style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"body_div\">\r\n");
      out.write("        <div class=\"title_div\">\r\n");
      out.write("            <h3>8839 林免冲</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content_div\">\r\n");
      out.write("            <form class=\"form-horizontal\" action=\"Login.action\" \r\n");
      out.write("            \tmethod=\"post\" name=\"login_form\">\r\n");
      out.write("                <div class=\"form_title\">\r\n");
      out.write("                    <p><h4>电影租赁管理系统</h4></p>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group input_style\">\r\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-sm-3\">用户名</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control col-sm-9\" id=\"uname\" name=\"username\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group input_style\">\r\n");
      out.write("                    <label for=\"pswd\" class=\"control-label col-sm-3\">密码</label>\r\n");
      out.write("                    <input type=\"password\" class=\"form-control col-sm-9\" id=\"pswd\" name=\"password\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group input_style\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-md\">登录</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
if(request.getAttribute("msg") != null 
                	&& !request.getAttribute("msg").toString().trim().equals("")){ 
      out.write("\r\n");
      out.write("                <div class=\"form_footer\">\r\n");
      out.write("                    <p>");
      out.print( request.getAttribute("msg") );
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
