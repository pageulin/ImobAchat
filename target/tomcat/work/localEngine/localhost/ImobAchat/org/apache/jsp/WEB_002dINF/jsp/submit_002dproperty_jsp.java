package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class submit_002dproperty_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"background-grid\">\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"home-content\" class=\"row height-100pc\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t    <div class=\"col-md-offset-3 col-md-6 margin-top-30px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <h3>Titre</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <input type=\"text\" placeholder=\"Titre (30 caractÃ¨res max)\" maxlength=\"30\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <textarea class=\"form-control margin-top-10px\" placeholder=\"Description...\" ></textarea>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <h3>Localisation</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <input type=\"text\" id=\"form_gmap_search_input\" placeholder=\"Adresse\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t        <input type=\"hidden\" id=\"gmap_longitude\"/>\r\n");
      out.write("\t\t        <input type=\"hidden\" id=\"gmap_latitude\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <h3>Prix et surface</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <div class=\"row margin-top-10px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        \t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t        \t<input type=\"text\" placeholder=\"Prix (â¬)\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t        <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t        \t<input type=\"text\" placeholder=\"Surface (mÂ²)\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t        <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t        \t<input type=\"text\" placeholder=\"Nombre de piÃ¨ces\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t        <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t        \t<input type=\"text\" placeholder=\"Chambres\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t        <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t        \t<input type=\"text\" placeholder=\"Salles de bains\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t    <h3>Images</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t    <div class=\"row margin-top-10px\">\r\n");
      out.write("\t\t\t    \t<input type=\"file\" class=\"col-md-6\">\r\n");
      out.write("\t\t\t    \t<input type=\"file\" class=\"col-md-6\">\r\n");
      out.write("\t\t\t    \t<input type=\"file\" class=\"col-md-6\">\r\n");
      out.write("\t\t\t    \t<input type=\"file\" class=\"col-md-6\">\r\n");
      out.write("\t\t\t    \t<input type=\"file\" class=\"col-md-6\">\r\n");
      out.write("\t\t\t    \t<input type=\"file\" class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<h3>Contact</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Mail\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"TÃ©lÃ©phone\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-info margin-top-20px\">Publier</button>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
