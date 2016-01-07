package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>ImobAchat</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta name=\"author\" content=\"\"/>\r\n");
      out.write("    <meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\"/>\r\n");
      out.write("    <meta content=\"fr\" http-equiv=\"Content-Language\"/>\r\n");
      out.write("\r\n");
      out.write("    <!-- THEME STYLESHEETS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/bootstrap.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/font-awesome.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <!-- THEME ACTUALITY SLIDER -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/slider.css\"/>\r\n");
      out.write("    \r\n");
      out.write("    <!-- GOOGLE WEB FONTS -->\r\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,300italic,400italic' rel='stylesheet' type='text/css' />\r\n");
      out.write("\r\n");
      out.write("    <!-- THEME ADMIN -->\r\n");
      out.write("    <link href=\"resources/css/AdminLTE.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"background-grid\">\r\n");
      out.write("  \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/header.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"home-content\" class=\"row height-100pc\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/property-details.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- property-details.jsp -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- JQUERY -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- MAIN SCRIPT -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/index.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- SEARCH MAP SCRIPT -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/modernizr-2.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/infobox.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/markerclusterer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/property.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/gmap-data.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ACTUALITY SLIDER SCRIPT -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.carouFredSel-6.2.1-packed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/property-slider.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
