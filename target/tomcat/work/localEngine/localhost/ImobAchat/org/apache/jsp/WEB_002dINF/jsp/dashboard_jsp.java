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

      out.write("<body class=\"skin-blue\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrapper row-offcanvas row-offcanvas-left\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/adminSideLeft.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <aside class=\"right-side\">\r\n");
      out.write("            <!-- Main content -->\r\n");
      out.write("\t\t\t<section class=\"content\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    <!-- Small boxes (Stat box) -->\r\n");
      out.write("\t\t\t    <div class=\"row\">\r\n");
      out.write("\t\t\t        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("\t\t\t            <!-- small box -->\r\n");
      out.write("\t\t\t            <div class=\"small-box bg-aqua\">\r\n");
      out.write("\t\t\t                <div class=\"inner\">\r\n");
      out.write("\t\t\t                    <h4><b>150</b></h4>\r\n");
      out.write("\t\t\t                    <p>Utilisateurs</p>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <div class=\"icon\">\r\n");
      out.write("\t\t\t                    <i class=\"fa fa-user\"></i>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <a href=\"/ImobAchat/admin/users\" class=\"pointer small-box-footer pointer\">\r\n");
      out.write("\t\t\t                    Visualiser <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("\t\t\t                </a>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t        </div><!-- ./col -->\r\n");
      out.write("\t\t\t        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("\t\t\t            <!-- small box -->\r\n");
      out.write("\t\t\t            <div class=\"small-box bg-green\">\r\n");
      out.write("\t\t\t                <div class=\"inner\">\r\n");
      out.write("\t\t\t                    <h4><b>30</b></h4>\r\n");
      out.write("\t\t\t                    <p>Propriétés</p>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <div class=\"icon\">\r\n");
      out.write("\t\t\t                    <i class=\"fa fa-home\"></i>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <a href=\"/ImobAchat/admin/properties\" class=\"pointer small-box-footer pointer\">\r\n");
      out.write("\t\t\t                    Visualiser <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("\t\t\t                </a>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t        </div><!-- ./col -->\r\n");
      out.write("\t\t\t    </div><!-- /.row -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    <!-- top row -->\r\n");
      out.write("\t\t\t    <div class=\"row\">\r\n");
      out.write("\t\t\t        <div class=\"col-xs-12 connectedSortable\">\r\n");
      out.write("\t\t\t            \r\n");
      out.write("\t\t\t        </div><!-- /.col -->\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <!-- /.row -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</section><!-- /.content -->\r\n");
      out.write("        </aside>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>");
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
