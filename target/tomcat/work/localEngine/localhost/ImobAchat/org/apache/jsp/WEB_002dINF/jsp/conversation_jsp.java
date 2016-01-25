package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class conversation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<section class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("    <h3>Sujet !!!</h3>\r\n");
      out.write("    <!-- CONVERSATION BEGIN -->\r\n");
      out.write("    <div class=\"mailbox row\">\r\n");
      out.write("        <div class=\"col-xs-12\">\r\n");
      out.write("            <div class=\"box box-solid\">\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"grey-box\">\r\n");
      out.write("                                <div><label>Moi - </label><b>12:30</b></div>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent sit amet porttitor nibh. Sed sed posuere nibh. Aenean tempus elementum massa. Curabitur non urna nibh. Proin et imperdiet nibh. Cras est turpis, placerat et interdum eu, commodo vitae metus. Etiam at metus vitae nunc tristique euismod eu molestie erat. \r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"grey-box\">\r\n");
      out.write("                                <div><label>Babar - </label><b>12:28</b></div>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent sit amet porttitor nibh. Sed sed posuere nibh. Aenean tempus elementum massa. Curabitur non urna nibh. Proin et imperdiet nibh. Cras est turpis, placerat et interdum eu, commodo vitae metus. Etiam at metus vitae nunc tristique euismod eu molestie erat. \r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div><!-- /.col (RIGHT) -->\r\n");
      out.write("                    </div><!-- /.row -->\r\n");
      out.write("                </div><!-- /.box-body -->\r\n");
      out.write("                <div class=\"box-footer clearfix\">\r\n");
      out.write("                    <div class=\"pull-right\">\r\n");
      out.write("                        <b>Page 1/1</b>\r\n");
      out.write("                        <button class=\"btn btn-md btn-info\"><i class=\"fa fa-caret-left\"></i></button>\r\n");
      out.write("                        <button class=\"btn btn-md btn-info\"><i class=\"fa fa-caret-right\"></i></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div><!-- box-footer -->\r\n");
      out.write("            </div><!-- /.box -->\r\n");
      out.write("        </div><!-- /.col (MAIN) -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- CONVERSATION END -->\r\n");
      out.write("\r\n");
      out.write("    <!-- quick email widget -->\r\n");
      out.write("    <div class=\"box box-info\">\r\n");
      out.write("        <div class=\"box-header\">\r\n");
      out.write("            <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("            <h3 class=\"box-title\">RÃ©pondre</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box-body\">\r\n");
      out.write("            <form action=\"#\" method=\"post\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <textarea class=\"textarea\" placeholder=\"Tapez votre message ici...\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box-footer clearfix\">\r\n");
      out.write("            <button class=\"pull-right btn btn-info\" id=\"sendEmail\">Envoyer <i class=\"fa fa-arrow-circle-right\"></i></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>");
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
