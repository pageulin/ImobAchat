package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- Main content -->\r\n");
      out.write("<section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Small boxes (Stat box) -->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("            <!-- small box -->\r\n");
      out.write("            <div class=\"small-box bg-aqua\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                    <h4><b>150</b></h4>\r\n");
      out.write("                    <p>Utilisateurs</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                    <i class=\"fa fa-user\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a onclick=\"loadUsers()\" class=\"small-box-footer pointer\">\r\n");
      out.write("                    Visualiser <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- ./col -->\r\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("            <!-- small box -->\r\n");
      out.write("            <div class=\"small-box bg-green\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                    <h4><b>30</b></h4>\r\n");
      out.write("                    <p>PropriÃ©tÃ©s</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                    <i class=\"fa fa-home\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a onclick=\"loadProperties()\" class=\"small-box-footer pointer\">\r\n");
      out.write("                    Visualiser <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- ./col -->\r\n");
      out.write("    </div><!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("    <!-- top row -->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xs-12 connectedSortable\">\r\n");
      out.write("            \r\n");
      out.write("        </div><!-- /.col -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("</section><!-- /.content -->");
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
