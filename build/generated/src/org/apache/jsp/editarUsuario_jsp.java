package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.pais;
import java.util.List;

public final class editarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>30Fit</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link href=\"CSS/inicio/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/inicio/register.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/font.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/navegador/navegador.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"icons/logo/peso.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h1 class=\"logo\">30Fit</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <form action=\"controlador\" method=\"post\" class=\"form-register\" onsubmit=\"return validarCamposVacios()\" id=\"form-input\">\n");
      out.write("            <h2 class=\"form__titulo\">Crea una Cuenta</h2>\n");
      out.write("            <div class=\"contenedor-inputs\">\n");
      out.write("                <label for=\"cod\" style=\"display: none;\">Id Usuario </label>\n");
      out.write("                <input type=\"hidden\" name=\"cod\" id=\"cod\" value=\"0\" >  \n");
      out.write("\n");
      out.write("                <label for=\"nombre\" style=\"display: none\">Nombre </label>\n");
      out.write("                <input type=\"text\" id=\"nombre_us\" name=\"nombre\" placeholder=\"Nombre\"  class=\"input-100\" onkeypress=\"return validarSoloLetras(event);\" >\n");
      out.write("                <div class=\"error\" id=\"msg-nombre\" style=\"display: none;\">Dame su nombre.</div>\n");
      out.write("\n");
      out.write("                <label for=\"apellido\" style=\"display: none\">Apellidos </label>\n");
      out.write("                <input type=\"text\" id=\"apellido_us\" name=\"apellido\" placeholder=\"apellido\" class=\"input-100\" onkeypress=\"return validarSoloLetras(event);\" > \n");
      out.write("                <div class=\"error\" id=\"msg-apellido\" style=\"display: none;\">Dame su apellido.</div>\n");
      out.write("\n");
      out.write("                <div class=\"contenerdor-genero\">\n");
      out.write("                    <label for=\"sexo\" style=\"display: none\">Genero</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"radio\" id=\"masculino\" name=\"sexo\"  value=\"Masculino\"> \n");
      out.write("                    <label for=\"masculino\" class=\"label-genero\" >Masculino </label>\n");
      out.write("\n");
      out.write("                    <input type=\"radio\" id=\"femenino\" name=\"sexo\"  value=\"Femenino\">\n");
      out.write("                    <label for=\"femenino\" class=\"label-genero\">Femenino </label>\n");
      out.write("\n");
      out.write("                    <div class=\"error\" id=\"msg-genero\" style=\"display: none;\">Seleccione su genero.</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label for=\"fechaNacimiento\" class=\"input-100\">Fecha de Nacimiento</label>\n");
      out.write("                <input type=\"date\" id=\"fechaNacimiento_us\" name=\"fechaNacimiento\" class=\"input-100\" >\n");
      out.write("                <div class=\"error\" id=\"msg-fechaNacimiento\" style=\"display: none;\">Comple tu fecha de nacimiento.</div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label for=\"correo\" style=\"display: none\">Correo Electronico </label>\n");
      out.write("                <input type=\"email\" id=\"correo_us\" name=\"correo\" placeholder=\"Correo\" class=\"input-100\" > \n");
      out.write("                <div class=\"error\" id=\"msg-correo\" style=\"display: none;\">Dame un email correcto.</div>\n");
      out.write("\n");
      out.write("                <label for=\"nomUsuario\" style=\"display: none\" >Nombre Usuario</label>\n");
      out.write("                <input type=\"text\" id=\"nomUsuario_us\" name=\"nomUsuario\" placeholder=\"Usuario\"  class=\"input-100\" >\n");
      out.write("                <br>\n");
      out.write("                <div class=\"error\" id=\"msg-usuario\" style=\"display: none;\">Dame su nombre de usuario.</div>\n");
      out.write("                <span id=\"error1\"></span>\n");
      out.write("\n");
      out.write("                <ul class=\"ul-usuario\">\n");
      out.write("                    <li id=\"mayu\">1 Mayuscula</li>\n");
      out.write("                    <li id=\"min\">4 Minusculas</li>\n");
      out.write("                    <li id=\"digitos\">2 Digitos.</li>\n");
      out.write("                    <li id=\"especial\">1 Caracter especiual.</li>\n");
      out.write("                    <li id=\"caracteres\">Minimo 8 caracteres.</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <label for=\"password\" style=\"display: none\">Contraseña </label>\n");
      out.write("                <input type=\"password\" id=\"password_us\" name=\"password\" placeholder=\"Contraseña\" class=\"input-100\" >\n");
      out.write("                <img src=\"icons/ojo.png\" alt=\"\" id=\"img-ojo-1\"/>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"error\" id=\"msg-password\" style=\"display: none;\">Dame su nueva contraseña.</div>\n");
      out.write("                <span id=\"error2\"></span>\n");
      out.write("\n");
      out.write("                <ul class=\"ul-password\">\n");
      out.write("                    <li id=\"mayus\">3 Mayusculas.</li>\n");
      out.write("                    <li id=\"special\">3 Caracteres especiales.</li>\n");
      out.write("                    <li id=\"numbers\">1 Digitos.</li>\n");
      out.write("                    <li id=\"lower\">1 Minusculas.</li>\n");
      out.write("                    <li id=\"len\">Minimo 8 caracteres.</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <label for=\"repitaPassword\" style=\"display: none\">Repita Contraseña </label>\n");
      out.write("                <input type=\"password\" id=\"repitaPassword_us\"  name=\"repitaPassword\" placeholder=\"Repita contraseña\" class=\"input-100\" >\n");
      out.write("                <img src=\"icons/ojo.png\" alt=\"\" id=\"img-ojo-2\"/>\n");
      out.write("                <div class=\"error\" id=\"msg-repitaPassword\" style=\"display: none;\">Repite la contraseña.</div>\n");
      out.write("                <span id=\"msg-error\"></span>\n");
      out.write("                <br>\n");
      out.write("                <span id=\"error3\"></span>\n");
      out.write("\n");
      out.write("                <label for=\"numCelular\" style=\"display: none\">Numero de Celular </label>\n");
      out.write("                <input type=\"text\" id=\"numeroCelular_us\" name=\"numCelular\" placeholder=\"Numero de celular\" class=\"input-100\" onkeypress=\"return validarSoloNumeros(event);\" >\n");
      out.write("                <div class=\"error\" id=\"msg-numeroCelular\" style=\"display: none;\">Dame su numero.</div>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label>¿Donde Vives?</label>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"pais\" style=\"display: none\">Pais </label>\n");
      out.write("                <select name=\"pais\" id=\"nombre_pais\" class=\"input-100\">\n");
      out.write("                    ");

                        // Se recurpera de la variable de sessión la listaPais
                        List<pais> listaPais = (List<pais>) request.getAttribute("listaPais");
                        for (pais pais : listaPais) {
                            out.println("<option value='" + pais.getCod_pais() + "' >" + pais.getNombre_pais() + "</option>");
                        }
                    
      out.write(" \n");
      out.write("                </select>\n");
      out.write("                <!--   <label for=\"ciudad\" > </label>\n");
      out.write("               <select name=\"ciudad\" id=\"nombre_cty\" >\n");
      out.write("                ");
      out.write("\n");
      out.write("              </select>-->\n");
      out.write("                <div class=\"error\" id=\"msg-ciudad\" style=\"display: none;\">Seleccionar la ciudad.</div>\n");
      out.write("                <div class=\"error\" id=\"msg-pais\" style=\"display: none;\">Seleccionar el pais.</div>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"peso\" style=\"display: none\"> Peso</label>\n");
      out.write("                <input type=\"text\" id=\"peso_us\" name=\"peso\" placeholder=\"Ingrese su peso actual\" required=\"\" class=\"input-100\">\n");
      out.write("\n");
      out.write("                <label for=\"estatura\" style=\"display: none\"> Estatura</label>\n");
      out.write("                <input type=\"text\" id=\"estatura_us\" name=\"estatura\" placeholder=\"Ingrese su estatura actual\" required=\"\" class=\"input-100\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"btn-enviar\" value=\"Registrar\" class=\"btn-enviar\" id=\"btn-enviar\">\n");
      out.write("                <p class=\"form__link\">¿Ya tienes una cuenta? <a href=\"\">Ingrese aqui.</a></p>  \n");
      out.write("            </div>\n");
      out.write("        </form>   \n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <!-- <script src=\"JS/register/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("     <script src=\"JS/register/validarFormularios.js\" type=\"text/javascript\"></script>\n");
      out.write("     <script src=\"JS/register/validarLetrasNumeros.js\" type=\"text/javascript\"></script>\n");
      out.write("     <script src=\"JS/register/validarPassword.js\" type=\"text/javascript\"></script>\n");
      out.write("     <script src=\"JS/register/validarUsuario.js\" type=\"text/javascript\"></script>-->\n");
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
