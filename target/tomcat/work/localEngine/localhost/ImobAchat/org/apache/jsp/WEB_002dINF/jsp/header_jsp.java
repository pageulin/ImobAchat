package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<header class=\"row\">\r\n");
      out.write("    <label class=\"col-md-1 uppercase\">ImobAchat</label>\r\n");
      out.write("    <div class=\"col-md-4 pos-right\">\r\n");
      out.write("        <i class=\"fa fa-user\"></i>\r\n");
      out.write("        <label>user name</label>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<ul class=\"menu\">\r\n");
      out.write("    <li><a href=\"/ImobAchat/home\">Rechercher une annonce</a></li> <!-- onclick=\"loadSearchPropertie()\" -->\r\n");
      out.write("    <li><a onclick=\"loadActuality()\">ActualitÃ©</a></li>\r\n");
      out.write("    <li><a onclick=\"loadSubmitPropertie()\">DÃ©poser une annonce</a></li>\r\n");
      out.write("    <li><a onclick=\"loadProfile()\">Mon Profile</a></li>\r\n");
      out.write("    <li><a onclick=\"loadChat()\">Chat</a></li>\r\n");
      out.write("    <li><a href=\"/ImobAchat/admin\">Admin</a></li>\r\n");
      out.write("</ul>");
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
