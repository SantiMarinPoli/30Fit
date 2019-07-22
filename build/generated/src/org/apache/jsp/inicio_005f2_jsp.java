package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>30Fit</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link href=\"CSS/inicio_2/inicio_2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/navegador/navegador.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
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
      out.write("        <li><a href=\"profile.jsp\">Perfil</a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\">Contactos</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <img src=\"img/banner.jpg\" alt=\"Titulo_1\" class=\"banner_img\" >\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h2 class=\"banner__titulo\">Bienvenido 30Fit</h2>\n");
      out.write("                <p class=\"banner__text\">Trabaje con nosotros y cumple tus sueños</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <main class=\"main\">\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <section class=\"info\">\n");
      out.write("                    <articule class=\"info__columna\">\n");
      out.write("                        <img src=\"img/img1.jpg\" alt=\"\" class=\"info__img\">\n");
      out.write("                        <h2 class=\"info__titulo\">Titulo1</h2>\n");
      out.write("                        <p class=\"info__txt\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Qui ad est dolore, perferendis numquam quasi?</p>\n");
      out.write("                    </articule>\n");
      out.write("                    <articule class=\"info__columna\">\n");
      out.write("                        <img src=\"img/img1.jpg\" alt=\"\" class=\"info__img\">\n");
      out.write("                        <h2 class=\"info__titulo\">Titulo2</h2>\n");
      out.write("                        <p class=\"info__txt\">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>\n");
      out.write("                    </articule>\n");
      out.write("                    <articule class=\"info__columna\">\n");
      out.write("                        <img src=\"img/img1.jpg\" alt=\"\" class=\"info__img\">\n");
      out.write("                        <h2 class=\"info__titulo\">Titulo3</h2>\n");
      out.write("                        <p class=\"info__txt\">Impedit, repudiandae eveniet itaque repellat optio vitae esse dignissimos ipsa maxime vel, quis quibusdam odio.</p>\n");
      out.write("                    </articule>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("                <section class=\"cursos\">\n");
      out.write("                    <h2 class=\"section__titulo\">Nuestros Clases</h2>\n");
      out.write("                    <div class=\"cursos__columna\">\n");
      out.write("                        <img src=\"img/img2.jpg\" alt=\"imagewn_2\" class=\"cursos__img\">\n");
      out.write("                        <div class=\"cursos__description\">\n");
      out.write("                            <h3 class=\"cursos__titulo\">Rutina de Fuerza</h3>\n");
      out.write("                            <p class=\"cursos__txt\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eligendi!</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cursos__columna\">\n");
      out.write("                        <img src=\"img/img2.jpg\" alt=\"imagewn_2\" class=\"cursos__img\">\n");
      out.write("                        <div class=\"cursos__description\">\n");
      out.write("                            <h3 class=\"cursos__titulo\">Ruitnas Adominal</h3>\n");
      out.write("                            <p class=\"cursos__txt\">Veritatis blanditiis aut totam, natus cum voluptatibus qui rerum!</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cursos__columna\">\n");
      out.write("                        <img src=\"img/img2.jpg\" alt=\"imagewn_2\" class=\"cursos__img\">\n");
      out.write("                        <div class=\"cursos__description\">\n");
      out.write("                            <h3 class=\"cursos__titulo\">Ruitna de Piernas</h3>\n");
      out.write("                            <p class=\"cursos__txt\">Natus non enim fuga id! Placeat vero delectus a.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cursos__columna\">\n");
      out.write("                        <img src=\"img/img2.jpg\" alt=\"imagewn_2\" class=\"cursos__img\">\n");
      out.write("                        <div class=\"cursos__description\">\n");
      out.write("                            <h3 class=\"cursos__titulo\">Rutina de Cardio</h3>\n");
      out.write("                            <p class=\"cursos__txt\">Minus corrupti nulla in veritatis esse, asperiores aut cumque!</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
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
      out.write('\n');
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
