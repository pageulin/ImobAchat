package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class property_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-md-12 margin-top-30px\">\r\n");
      out.write("\t\t<center><b class=\"font-size-20px\">Paris, France, 15 rue Victor Hugo</b></center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t<div class=\"col-md-offset-2 col-md-4\">\r\n");
      out.write("\t\t\t<h3>DÃ©tails</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row grey-box\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 align-left\">\r\n");
      out.write("\t\t\t\t\t<p>Price</p>\r\n");
      out.write("\t\t\t\t\t<p>Surface</p>\r\n");
      out.write("\t\t\t\t\t<p>Chambres</p>\r\n");
      out.write("\t\t\t\t\t<p>Salles de bains</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 align-left\">\r\n");
      out.write("\t\t\t\t\t<p>1000 â¬</p>\r\n");
      out.write("\t\t\t\t\t<p>120 mÂ²</p>\r\n");
      out.write("\t\t\t\t\t<p>2</p>\r\n");
      out.write("\t\t\t\t\t<p>2</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3>Contact</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row grey-box\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 align-left\">\r\n");
      out.write("\t\t\t\t\t<p>Mail</p>\r\n");
      out.write("\t\t\t\t\t<p>TÃ©lÃ©phone</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 align-left\">\r\n");
      out.write("\t\t\t\t\t<p>babar@gmail.com</p>\r\n");
      out.write("\t\t\t\t\t<p>0650126952</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3>Photo principal</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<img class=\"col-md-12\" src=\"resources/images/property/property1.jpg\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-md-12 margin-top-30px\">\r\n");
      out.write("\t\t<div class=\"col-md-offset-2 col-md-8\">\r\n");
      out.write("\t\t\t<h3>Photos</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<a target=\"blank\" href=\"resources/images/property/property1.jpg\"><img class=\"col-md-3 margin-top-10px\" src=\"resources/images/property/property1.jpg\" /></a>\r\n");
      out.write("\t\t\t\t<a target=\"blank\" href=\"resources/images/property/property2.jpg\"><img class=\"col-md-3 margin-top-10px\" src=\"resources/images/property/property2.jpg\" /></a>\r\n");
      out.write("\t\t\t\t<a target=\"blank\" href=\"resources/images/property/property3.jpg\"><img class=\"col-md-3 margin-top-10px\" src=\"resources/images/property/property3.jpg\" /></a>\r\n");
      out.write("\t\t\t\t<a target=\"blank\" href=\"resources/images/property/property4.jpg\"><img class=\"col-md-3 margin-top-10px\" src=\"resources/images/property/property4.jpg\" /></a>\r\n");
      out.write("\t\t\t\t<a target=\"blank\" href=\"resources/images/property/property5.jpg\"><img class=\"col-md-3 margin-top-10px\" src=\"resources/images/property/property5.jpg\" /></a>\r\n");
      out.write("\t\t\t\t<a target=\"blank\" href=\"resources/images/property/property6.jpg\"><img class=\"col-md-3 margin-top-10px\" src=\"resources/images/property/property6.jpg\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
