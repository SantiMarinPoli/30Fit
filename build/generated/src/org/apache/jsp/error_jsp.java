package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navegador.jsp");
    _jspx_dependants.add("/publicidad.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link href=\"CSS/error/error.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/icons-fonts/icons-fonts.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/navegador/navegador.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"icons/logo/peso.png\">\n");
      out.write("        <title>30Fit</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("                <h1 class=\"logo\">30Fit</h1>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<input type=\"checkbox\" id=\"btn-menu\">\n");
      out.write("<label for=\"btn-menu\" ><img src=\"icons/navegador/menu.png\" alt=\"menu\" class=\"icon-menu\"/></label>\n");
      out.write("\n");
      out.write("<nav class=\"menu\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"controlador?opcion=inicio\">Registrese</a></li>\n");
      out.write("\n");
      out.write("        <li class=\"subMenu\"><a href=\"clases.jsp\">Clases <img src=\"icons/navegador/flecha-chevron-hacia-abajo.png\" alt=\"icon down\" class=\"icon-down-open\"/></a>\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"class_brazos.jsp\">Brazos</a></li>\n");
      out.write("                <li><a href=\"class_tripces.jsp\">Tripces</a></li>\n");
      out.write("                <li><a href=\"class_hombros.jsp\">Hombres</a></li>\n");
      out.write("                <li><a href=\"class_pecho.jsp\">Pecho</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li><a href=\"controlador?opcion=perfil\">Perfil</a> </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <div class=\"contenedor__error\">\n");
      out.write("            <h1 class=\"error\">ERROR</h1>\n");
      out.write("            <h2 class=\"error__404\">404</h2>\n");
      out.write("            <p class=\"txt-error\">\n");
      out.write("                <span class=\"span__error\">SORRY, LA PAGINA QUE BUSCAS NO EXISTE!</span><br>\n");
      out.write("                No te preocupes, solo tienes un café y vuelve\n");
      out.write("            </p>\n");
      out.write("           ");
      out.write("\n");
      out.write("\n");
      out.write("            <img class=\"img-error\" src=\"img/error.gif\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <a href=\"#\"><img src=\"icons/navegador/facebook-logo.png\" alt=\"facebook\" class=\"icon-facebook\"/></a>\n");
      out.write("    <img src=\"icons/navegador/logo-de-instagram.png\" alt=\"instagram\" class=\"icon-instagram\" />\n");
      out.write("    <a href=\"\"><img src=\"icons/navegador/simbolo-de-twitter.png\" alt=\"twiter\" class=\"icon-twitter\"/></a>\n");
      out.write("    <a href=\"#\"><img src=\"icons/navegador/vid.png\" alt=\"vine\" class=\"icon-vine\"/></a>\n");
      out.write("    <p class=\"copy\">&copy; Healthy life 2017 - Todos los derechos reservado</p>\n");
      out.write("</footer>\n");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("    <script src=\"JS/register/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/menu/menu.js\" type=\"text/javascript\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
