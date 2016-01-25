package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<section class=\"content\">\r\n");
      out.write("    <!-- MAILBOX BEGIN -->\r\n");
      out.write("    <div class=\"mailbox row\">\r\n");
      out.write("        <div class=\"col-xs-12\">\r\n");
      out.write("            <div class=\"box box-solid\">\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"table-responsive\">\r\n");
      out.write("\t\t\t\t\t    <!-- THE MESSAGES -->\r\n");
      out.write("\t\t\t\t\t    <h3>Utilisateurs</h3>\r\n");
      out.write("\t\t\t\t\t    <table class=\"table table-mailbox\">\r\n");
      out.write("\t\t\t\t\t        <tr class=\"row background-eee\">\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-5\"><a href=\"#\">Titi</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-6\"><a href=\"#\">Titi@gmail.com</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-1\">0622146914</td>\r\n");
      out.write("\t\t\t\t\t        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t        <tr class=\"row background-eee\">\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-5\"><a href=\"#\">Toto</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-6\"><a href=\"#\">Toto@gmail.com</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-1\">0624145914</td>\r\n");
      out.write("\t\t\t\t\t        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t        <tr class=\"row background-eee \">\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-5\"><a href=\"#\">Tutu</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-6\"><a href=\"#\">Tutu@gmail.com</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-1\">0622145994</td>\r\n");
      out.write("\t\t\t\t\t        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t        <tr class=\"row background-eee\">\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-5\"><a href=\"#\">Tata</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-6\"><a href=\"#\">Tata@gmail.com</a></td>\r\n");
      out.write("\t\t\t\t\t            <td class=\"col-md-1\">0682145914</td>\r\n");
      out.write("\t\t\t\t\t        </tr>\r\n");
      out.write("\t\t\t\t\t    </table>\r\n");
      out.write("\t\t\t\t\t</div><!-- /.table-responsive -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
