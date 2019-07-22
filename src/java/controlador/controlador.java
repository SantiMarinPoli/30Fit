package controlador;

import modelo.Pais;
import modelo.Usuario;
import DAO.DAOPais;
import DAO.DAOUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utilidades.DBUtil;

@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        Connection conexion = DBUtil.getConexion();

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controlador at " + request.getContextPath() + "</h1>");
            out.println("</p>Este es mi primer servelet</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opcion = (String) request.getParameter("opcion");

        if (opcion != null) {
            System.out.println("El valor de la opcion es: " + opcion);
            if (opcion.equals("perfil")) {
                try {
                    perfil(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (opcion.equals("registroUsuario")) {

                try {
                    DAOPais daoPais = new DAOPais();
                    List<Pais> listaPais = daoPais.ontenerTodosLosPaises();
                    request.setAttribute("listaPais", listaPais);

                    RequestDispatcher vista = request.getRequestDispatcher("registroUsuario.jsp");
                    vista.forward(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (opcion.equals("borrar")) {
                int cod_us = Integer.parseInt((String) request.getParameter("cod_us"));
                DAOUsuario daoUsuario = new DAOUsuario();
                try {
                    daoUsuario.borrar(cod_us);
                    List<Usuario> listaUsuario = daoUsuario.obtenerTodosLosUsuarios();
                    request.setAttribute("listaUsuario", listaUsuario);
                    RequestDispatcher vista = request.getRequestDispatcher("perfil.jsp");
                    vista.forward(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (opcion.equals("editar")) {

                try {

                    DAOPais daoPais = new DAOPais();
                    List<Pais> listaPais = daoPais.ontenerTodosLosPaises();
                    request.setAttribute("listaPais", listaPais);

                    int cod_us = Integer.parseInt((String) request.getParameter("cod_us"));
                    DAOUsuario daoUsuario = new DAOUsuario();
                    Usuario u = daoUsuario.seleccionarUnUsuarioElegidoPor(cod_us);
                    request.setAttribute("usuario", u);

                    RequestDispatcher vista = request.getRequestDispatcher("editarUsuario.jsp");
                    vista.forward(request, response);

                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void perfil(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
        try {
            DAOUsuario daoUsuario = new DAOUsuario();
            List<Usuario> listaUsuario = daoUsuario.obtenerTodosLosUsuarios();
            request.setAttribute("listaUsuario", listaUsuario);
            RequestDispatcher vista = request.getRequestDispatcher("perfil.jsp");
            vista.forward(request, response);
        } catch (SQLException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("operacion");
        if (op != null) {
            if (op.equalsIgnoreCase("insertar")) {
                crearUsuario(request, op, response);
            }else{
                editarUsuario(request, op, response);
            }
        }

    }

    private void crearUsuario(HttpServletRequest request, String op, HttpServletResponse response) throws IOException, ServletException, NumberFormatException {
        try {
            int cod_us = Integer.parseInt(request.getParameter("cod"));
            String nombre_us = request.getParameter("nombre");
            String apellido_us = request.getParameter("apellido");
            String sexo_us = request.getParameter("sexo");
            Date fechaNacimiento_us = Date.valueOf(request.getParameter("fechaNacimiento"));
            String correo_us = request.getParameter("correo");
            String nomUsuario_us = request.getParameter("nomUsuario");
            String password_us = request.getParameter("password");
            String numCelular_us = request.getParameter("numCelular");
            int cod_pais = Integer.parseInt(request.getParameter("pais"));
            DAOPais daoPais = new DAOPais();
            String pais = daoPais.obtenerNombrePaisPor(cod_pais);
            String peso_us = request.getParameter("peso");
            String estatura_us = request.getParameter("estatura");

            HttpSession objSesion = request.getSession(true);
            objSesion.setAttribute("nomUsuario_us", nomUsuario_us);

            Usuario u = new Usuario(cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us, password_us, numCelular_us, cod_pais, pais, peso_us, estatura_us);

            DAOUsuario daoUsuario = new DAOUsuario();

            daoUsuario.guardar(u);

            perfil(request, response);
        } catch (SQLException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        private void editarUsuario(HttpServletRequest request, String op, HttpServletResponse response) throws IOException, ServletException, NumberFormatException {
        try {
            int cod_us = Integer.parseInt(request.getParameter("cod"));
            String nombre_us = request.getParameter("nombre");
            String apellido_us = request.getParameter("apellido");
            String sexo_us = request.getParameter("sexo");
            Date fechaNacimiento_us = Date.valueOf(request.getParameter("fechaNacimiento"));
            String correo_us = request.getParameter("correo");
            String nomUsuario_us = request.getParameter("nomUsuario");
            String password_us = request.getParameter("password");
            String numCelular_us = request.getParameter("numCelular");
            int cod_pais = Integer.parseInt(request.getParameter("pais"));
            DAOPais daoPais = new DAOPais();
            String pais = daoPais.obtenerNombrePaisPor(cod_pais);
            String peso_us = request.getParameter("peso");
            String estatura_us = request.getParameter("estatura");

            HttpSession objSesion = request.getSession(true);
            objSesion.setAttribute("nomUsuario_us", nomUsuario_us);

            Usuario u = new Usuario(cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us, password_us, numCelular_us, cod_pais, pais, peso_us, estatura_us);

            DAOUsuario daoUsuario = new DAOUsuario();

            daoUsuario.editar(u);

            perfil(request, response);
        } catch (SQLException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
