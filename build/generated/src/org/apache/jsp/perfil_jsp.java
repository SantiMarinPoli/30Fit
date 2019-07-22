package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navegador.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link href=\"CSS/perfil/perfil.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/navegador/navegador.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>30Fir</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h1 class=\"logo\">30Fit</h1>\n");
      out.write("                ");
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
      out.write("        <li><a href=\"/30Fit/controlador\">Inicio</a></li>\n");
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
      out.write("        <li><a href=\"profile.jsp\">Perfil</a> </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <main class=\"main\">\n");
      out.write("    </body>\n");
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
