package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actuality_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- START RECENT PROPERTIES -->\r\n");
      out.write("<section id=\"recent-properties-slider\" class=\"wrap recent-properties recent-properties-slider\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"recent-properties-inner\">\r\n");
      out.write("      <div class=\"section-title\">\r\n");
      out.write("        <h3>PropriÃ©tÃ©s Recentes</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"recent-properties-content\">\r\n");
      out.write("        <div class=\"caroufredsel-wrap\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("              <div class=\"property-row\">\r\n");
      out.write("                <article class=\"hentry has-featured\">\r\n");
      out.write("                  <div class=\"property-featured\">\r\n");
      out.write("                    <a class=\"content-thumb\" href=\"property-details.html\">\r\n");
      out.write("                      <img src=\"resources/images/property/property1.jpg\" class=\"attachment-property-thumb\" alt=\"\" />\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <span class=\"property-category\">\r\n");
      out.write("                      <a href=\"type-single-family-home.html\">Appartement</a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <div class=\"property-detail\">\r\n");
      out.write("                      <div class=\"size\"><span>1913 mÂ²</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bathrooms\"><span>2</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bedrooms\"><span>4</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-wrap\">\r\n");
      out.write("                    <h2 class=\"property-title\"><a href=\"property-details.html\" title=\"Visalia, NJ 93277\">Paris, France</a></h2>\r\n");
      out.write("                    <div class=\"property-excerpt\">\r\n");
      out.write("                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum suscipit elementum hendrerit. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-summary\">\r\n");
      out.write("                    <div class=\"property-info\">\r\n");
      out.write("                      <div class=\"property-price\">\r\n");
      out.write("                        <span><span class=\"amount\">154500 â¬</span></span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"property-action\">\r\n");
      out.write("                        <a href=\"property-details.html\">Voir plus</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </article>\r\n");
      out.write("\r\n");
      out.write("                <article class=\"hentry has-featured\">\r\n");
      out.write("                  <div class=\"property-featured\">\r\n");
      out.write("                    <a class=\"content-thumb\" href=\"property-details.html\">\r\n");
      out.write("                      <img src=\"resources/images/property/property1.jpg\" class=\"attachment-property-thumb\" alt=\"\" />\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <span class=\"property-category\"><a href=\"type-single-family-home.html\">Appartement</a></span>\r\n");
      out.write("                    <div class=\"property-detail\">\r\n");
      out.write("                      <div class=\"size\"><span>1118 mÂ²</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bathrooms\"><span>2</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bedrooms\"><span>3</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-wrap\">\r\n");
      out.write("                    <h2 class=\"property-title\"><a href=\"property-details.html\" title=\"Single Family Residential, NJ\">Bordeaux, France</a></h2>\r\n");
      out.write("                    <div class=\"property-excerpt\">\r\n");
      out.write("                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum suscipit elementum hendrerit. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-summary\">\r\n");
      out.write("                    <div class=\"property-info\">\r\n");
      out.write("                      <div class=\"property-price\">\r\n");
      out.write("                        <span><span class=\"amount\">299000 â¬</span></span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"property-action\">\r\n");
      out.write("                        <a href=\"property-details.html\">Voir plus</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </article>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"property-row\">\r\n");
      out.write("                <article class=\"hentry has-featured\">\r\n");
      out.write("                  <div class=\"property-featured\">\r\n");
      out.write("                    <a class=\"content-thumb\" href=\"property-details.html\">\r\n");
      out.write("                      <img src=\"resources/images/property/property1.jpg\" class=\"attachment-property-thumb\" alt=\"\" /> </a>\r\n");
      out.write("                    <span class=\"property-category\"><a href=\"type-Appartement.html\">Appartement</a></span>\r\n");
      out.write("                    <div class=\"property-detail\">\r\n");
      out.write("                      <div class=\"size\"><span>1304 mÂ²</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bathrooms\"><span>2</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bedrooms\"><span>3</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-wrap\">\r\n");
      out.write("                    <h2 class=\"property-title\"><a href=\"property-details.html\" title=\"Peter Cooper Village\">Rouen, France</a></h2>\r\n");
      out.write("                    <div class=\"property-excerpt\">\r\n");
      out.write("                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum suscipit elementum hendrerit. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-summary\">\r\n");
      out.write("                    <div class=\"property-info\">\r\n");
      out.write("                      <div class=\"property-price\">\r\n");
      out.write("                        <span><span class=\"amount\">5109 â¬</span></span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"property-action\">\r\n");
      out.write("                        <a href=\"property-details.html\">Voir plus</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </article>\r\n");
      out.write("\r\n");
      out.write("                <article class=\"hentry has-featured\">\r\n");
      out.write("                  <div class=\"property-featured\">\r\n");
      out.write("                    <a class=\"content-thumb\" href=\"property-details.html\">\r\n");
      out.write("                      <img src=\"resources/images/property/property1.jpg\" class=\"attachment-property-thumb\" alt=\"\" /> </a>\r\n");
      out.write("                    <span class=\"property-category\"><a href=\"type-condo.html\">Appartement</a></span>\r\n");
      out.write("                    <div class=\"property-detail\">\r\n");
      out.write("                      <div class=\"size\"><span>1856 mÂ²</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bathrooms\"><span>2</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bedrooms\"><span>2</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-wrap\">\r\n");
      out.write("                    <h2 class=\"property-title\"><a href=\"property-details.html\" title=\"Ocala, FL34481\">Marseille, France</a></h2>\r\n");
      out.write("                    <div class=\"property-excerpt\">\r\n");
      out.write("                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum suscipit elementum hendrerit. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-summary\">\r\n");
      out.write("                    <div class=\"property-info\">\r\n");
      out.write("                      <div class=\"property-price\">\r\n");
      out.write("                        <span><span class=\"amount\">95000 â¬</span></span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"property-action\">\r\n");
      out.write("                        <a href=\"property-details.html\">Voir plus</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </article>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <div class=\"property-row\">\r\n");
      out.write("                <article class=\"hentry has-featured\">\r\n");
      out.write("                  <div class=\"property-featured\">\r\n");
      out.write("                    <a class=\"content-thumb\" href=\"property-details.html\">\r\n");
      out.write("                      <img src=\"resources/images/property/property1.jpg\" class=\"attachment-property-thumb\" alt=\"\" /> </a>\r\n");
      out.write("                    <span class=\"property-category\"><a href=\"type-single-family-home.html\">Appartement</a></span>\r\n");
      out.write("                    <div class=\"property-detail\">\r\n");
      out.write("                      <div class=\"size\"><span>123 mÂ²</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bathrooms\"><span>1</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bedrooms\"><span>1</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-wrap\">\r\n");
      out.write("                    <h2 class=\"property-title\"><a href=\"property-details.html\" title=\"New York Upper West Side\">Talence, France</a></h2>\r\n");
      out.write("                    <div class=\"property-excerpt\">\r\n");
      out.write("                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum suscipit elementum hendrerit. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-summary\">\r\n");
      out.write("                    <div class=\"property-info\">\r\n");
      out.write("                      <div class=\"property-price\">\r\n");
      out.write("                        <span><span class=\"amount\">3350 â¬</span></span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"property-action\">\r\n");
      out.write("                        <a href=\"property-details.html\">Voir plus</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </article>\r\n");
      out.write("\r\n");
      out.write("                <article class=\"hentry has-featured\">\r\n");
      out.write("                  <div class=\"property-featured\">\r\n");
      out.write("                    <a class=\"content-thumb\" href=\"property-details.html\">\r\n");
      out.write("                      <img src=\"resources/images/property/property1.jpg\" class=\"attachment-property-thumb\" alt=\"\" /> </a>\r\n");
      out.write("                    <span class=\"property-category\"><a href=\"type-Appartement.html\">Appartement</a></span>\r\n");
      out.write("                    <div class=\"property-detail\">\r\n");
      out.write("                      <div class=\"size\"><span> 1752 mÂ²</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bathrooms\"><span>2</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"bedrooms\"><span>2</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-wrap\">\r\n");
      out.write("                    <h2 class=\"property-title\"><a href=\"property-details.html\" title=\"AVA High Line\">Lille, France</a></h2>\r\n");
      out.write("                    <div class=\"property-excerpt\">\r\n");
      out.write("                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum suscipit elementum hendrerit. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"property-summary\">\r\n");
      out.write("                    <div class=\"property-info\">\r\n");
      out.write("                      <div class=\"property-price\">\r\n");
      out.write("                        <span><span class=\"amount\">3410 â¬</span></span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"property-action\">\r\n");
      out.write("                        <a href=\"property-details.html\">Voir plus</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </article>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a class=\"caroufredsel-prev\" href=\"#\"></a>\r\n");
      out.write("        <a class=\"caroufredsel-next\" href=\"#\"></a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- JQUERY -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ACTUALITY SLIDER SCRIPT -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.carouFredSel-6.2.1-packed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/property-slider.js\"></script>\r\n");
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
