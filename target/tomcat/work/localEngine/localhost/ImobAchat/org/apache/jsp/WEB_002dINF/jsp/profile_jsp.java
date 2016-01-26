package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t        <!-- START INFO SECTION -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <h3>Vos infos</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <div class=\"row\">\r\n");
      out.write("\t\t          <div class=\"col-md-6\">\r\n");
      out.write("\t\t            <input type=\"text\" id=\"first_name\" placeholder=\"PrÃ©nom\" class=\"form-control\"/>\r\n");
      out.write("\t\t          </div>\r\n");
      out.write("\t\t          <div class=\"col-md-6\">\r\n");
      out.write("\t\t            <input type=\"text\" id=\"last_name\" placeholder=\"Nom\" class=\"form-control\"/>\r\n");
      out.write("\t\t          </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t            \r\n");
      out.write("\t\t        <input type=\"mail\" id=\"phone\" placeholder=\"TÃ©lÃ©phone\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <input type=\"mail\" id=\"mail\" placeholder=\"Address Mail\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        <input type=\"mail\" id=\"address\" placeholder=\"Address\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        <button id=\"edit-button\" class=\"btn btn-info margin-top-10px\" onclick=\"makeAccount()\">Modifier</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <!-- END INFO SECTION -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <!-- START NEW PASSWORD SECTION -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <h3 class=\"margin-top-30px\">Nouveau mot de passe</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <input type=\"mail\" id=\"last-password\" placeholder=\"Ancien mot de passe\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <input type=\"mail\" id=\"new-password\" placeholder=\"Nouveau mot de passe\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <input type=\"mail\" id=\"confirmation\" placeholder=\"Confirmation\" class=\"form-control margin-top-10px\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <button id=\"new-password-button\" class=\"btn btn-info margin-top-10px\" onclick=\"makeAccount()\">Modifier</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <!-- END NEW PASSWORD SECTION -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <!-- START FAVORITE SECTION -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <h3 class=\"margin-top-30px\">Vos annonces favorites</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <div class='white-box'>\r\n");
      out.write("\t\t            <div class='row'>\r\n");
      out.write("\t\t                <img class=\"col-md-4\" src=\"resources/images/property/featured-properties6.jpg\"/>\r\n");
      out.write("\t\t                <div class=\"col-md-8\">\r\n");
      out.write("\t\t                    <b>Appartement Ã  bordeaux</b>\r\n");
      out.write("\t\t                    <label class=\"color-888\">Saraceni tamen nec amici nobis umquam nec hostes optandi, ultro citroque discursantes quicquid inveniri poterat momento temporis parvi vastabant milvorum rapacium similes, qui si praedam dispexerint celsius, volatu rapiunt celeri, aut nisi impetraverint, non inmorantur.</label>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <div class='white-box margin-top-20px'>\r\n");
      out.write("\t\t            <div class='row'>\r\n");
      out.write("\t\t                <img class=\"col-md-4\" src=\"resources/images/property/featured-properties5.jpg\"/>\r\n");
      out.write("\t\t                <div class=\"col-md-8\">\r\n");
      out.write("\t\t                    <b>Appartement Ã  Rouen</b>\r\n");
      out.write("\t\t                    <label class=\"color-888\">Sed maximum est in amicitia parem esse inferiori. Saepe enim excellentiae quaedam sunt, qualis erat Scipionis in nostro, ut ita dicam, grege. Numquam se ille Philo, numquam Rupilio, numquam Mummio anteposuit, numquam inferioris ordinis amicis, Q. vero Maximum fratrem, egregium virum omnino, sibi nequaquam parem, quod is anteibat aetate, tamquam superiorem colebat suosque omnes per se posse esse ampliores volebat..</label>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <div class='white-box margin-top-20px'>\r\n");
      out.write("\t\t            <div class='row'>\r\n");
      out.write("\t\t                <img class=\"col-md-4\" src=\"resources/images/property/featured-properties4.jpg\"/>\r\n");
      out.write("\t\t                <div class=\"col-md-8\">\r\n");
      out.write("\t\t                    <b>Appartement Ã  Paris</b>\r\n");
      out.write("\t\t                    <label class=\"color-888\">Et quoniam apud eos ut in capite mundi morborum acerbitates celsius dominantur, ad quos vel sedandos omnis professio medendi torpescit, excogitatum est adminiculum sospitale nequi amicum perferentem similia videat, additumque est cautionibus paucis remedium aliud satis validum, ut famulos percontatum missos quem ad modum valeant noti hac aegritudine colligati, non ante recipiant domum quam lavacro purgaverint corpus. ita etiam alienis oculis visa metuitur labes.</label>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <!-- END FAVORITE SECTION -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\t\t\r\n");
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
