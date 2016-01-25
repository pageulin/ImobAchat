package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <h3>Chat</h3>\r\n");
      out.write("    <!-- MAILBOX BEGIN -->\r\n");
      out.write("    <div class=\"mailbox row\">\r\n");
      out.write("        <div class=\"col-xs-12\">\r\n");
      out.write("            <div class=\"box box-solid\">\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"table-responsive\">\r\n");
      out.write("                                <!-- THE MESSAGES -->\r\n");
      out.write("                                <table class=\"table table-mailbox\">\r\n");
      out.write("                                    <tr class=\"unread pointer\" onclick=\"loadConversation()\">\r\n");
      out.write("                                        <td class=\"name\"><a href=\"#\">Babar</a></td>\r\n");
      out.write("                                        <td class=\"subject\"><a href=\"#\">Urgent!!!!!!</a></td>\r\n");
      out.write("                                        <td class=\"time\">12:30</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr class=\"unread pointer\" onclick=\"loadConversation()\">\r\n");
      out.write("                                        <td class=\"name\"><a href=\"#\">Toto</a></td>\r\n");
      out.write("                                        <td class=\"subject\"><a href=\"#\">Bonne annÃ©e</a></td>\r\n");
      out.write("                                        <td class=\"time\">08:22</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr class=\"unread pointer\" onclick=\"loadConversation()\">\r\n");
      out.write("                                        <td class=\"name\"><a href=\"#\">Babar</a></td>\r\n");
      out.write("                                        <td class=\"subject\"><a href=\"#\">Joyeuse annÃ©e !!!</a></td>\r\n");
      out.write("                                        <td class=\"time\">07:20</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr class=\"unread pointer\" onclick=\"loadConversation()\">\r\n");
      out.write("                                        <td class=\"name\"><a href=\"#\">Titi</a></td>\r\n");
      out.write("                                        <td class=\"subject\"><a href=\"#\">Coucou</a></td>\r\n");
      out.write("                                        <td class=\"time\">17:34</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div><!-- /.table-responsive -->\r\n");
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
      out.write("    <!-- MAILBOX END -->\r\n");
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
