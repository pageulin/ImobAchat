package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Admin ImobAchat</title>\r\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\r\n");
      out.write("\r\n");
      out.write("        <!-- THEME STYLESHEETS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/font-awesome.min.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Theme style -->\r\n");
      out.write("        <link href=\"resources/css/AdminLTE.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"skin-blue\">\r\n");
      out.write("        <!-- header logo: style can be found in header.less -->\r\n");
      out.write("        <header class=\"row\">\r\n");
      out.write("            <label class=\"col-md-1 uppercase\">ImobAchat</label>\r\n");
      out.write("            <div class=\"col-md-4 pos-right pointer\" onclick=\"document.location.href='/ImobAchat/home'\">\r\n");
      out.write("                <i class=\"fa fa-close pointer\"></i>\r\n");
      out.write("                <label class=\"pointer\">Quitter</label>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper row-offcanvas row-offcanvas-left\">\r\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("            <aside class=\"left-side sidebar-offcanvas\">\r\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("                <section class=\"sidebar\">\r\n");
      out.write("                    <!-- Sidebar user panel -->\r\n");
      out.write("                    <div class=\"user-panel\">\r\n");
      out.write("                        <div class=\"pull-left info\">\r\n");
      out.write("                            <p>Hello, UserName</p>\r\n");
      out.write("\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("                    <ul class=\"sidebar-menu\">\r\n");
      out.write("                        <li> <!-- class=\"active\" -->\r\n");
      out.write("                            <a class=\"pointer\" onclick=\"loadDashBoard()\">\r\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"pointer\" onclick=\"loadUsers()\">\r\n");
      out.write("                                <i class=\"fa fa-user\"></i> <span>Utilisateurs</span>\r\n");
      out.write("                                <small class=\"badge pull-right bg-red\">150</small>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"pointer\" onclick=\"loadProperties()\">\r\n");
      out.write("                                <i class=\"fa fa-home\"></i> <span>PropriÃ©tÃ©s</span>\r\n");
      out.write("                                <small class=\"badge pull-right bg-yellow\">30</small>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </section>\r\n");
      out.write("                <!-- /.sidebar -->\r\n");
      out.write("            </aside>\r\n");
      out.write("\r\n");
      out.write("            <!-- Right side column. Contains the navbar and content of the page -->\r\n");
      out.write("            <aside class=\"right-side\">\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/dashboard.jsp", out, false);
      out.write("\r\n");
      out.write("            </aside><!-- /.right-side -->\r\n");
      out.write("        </div><!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    <!-- JQUERY -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- ADMIN SCRIPT -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/admin.js\"></script>\r\n");
      out.write("\r\n");
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
