package controlador;

import DAO.DAORutina;
import DAO.DAOUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Rutinas;
import modelo.Usuario;
import utilidades.DBUtil;

public class Rutina extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Rutina</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Rutina at " + request.getContextPath() + "</h1>");
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
            if (opcion.equals("listarRutina")) {
                try {
                    listarRutina(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (opcion.equals("borrar")) {
                int cod_rut = Integer.parseInt((String) request.getParameter("cod_rut"));
                DAORutina daoRutina = new DAORutina();
                try {
                    daoRutina.borrar(cod_rut);
                    List<Rutinas> listaRutina = daoRutina.obtenerTodosLosRegistrosDeRutinas();
                    request.setAttribute("listaRutina", listaRutina);
                    RequestDispatcher vista = request.getRequestDispatcher("listarRutina.jsp");
                    vista.forward(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (opcion.equals("class_brazos")) {
                try {
                    /**
                     * LISTAR TODOS LOS USUARIOS CREADOS
                     */
                    DAOUsuario daoUsuario = new DAOUsuario();
                    List<Usuario> listaUsuario = daoUsuario.obtenerTodosLosUsuarios();
                    request.setAttribute("listaUsuario", listaUsuario);
                    /**
                     * SE GUARDA TODOS LOS REGISTRO QUE ASIGNADO TODOS LOS DATOS
                     * Y LO ENVIA EN LA PAGINA JSP
                     */
                    RequestDispatcher vista = request.getRequestDispatcher("class_brazos.jsp");
                    vista.forward(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (opcion.equals("class_pecho")) {
                try {
                    /**
                     * LISTAR TODOS LOS USUARIOS CREADOS
                     */
                    DAOUsuario daoUsuario = new DAOUsuario();
                    List<Usuario> listaUsuario = daoUsuario.obtenerTodosLosUsuarios();
                    request.setAttribute("listaUsuario", listaUsuario);

                    /**
                     * SE GUARDA TODOS LOS REGISTRO QUE ASIGNADO TODOS LOS DATOS
                     * Y LO ENVIA EN LA PAGINA JSP
                     */
                    RequestDispatcher vista = request.getRequestDispatcher("class_pecho.jsp");
                    vista.forward(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (opcion.equals("class_espalda")) {
                try {
                    /**
                     * LISTAR TODOS LOS USUARIOS CREADOS
                     */
                    DAOUsuario daoUsuario = new DAOUsuario();
                    List<Usuario> listaUsuario = daoUsuario.obtenerTodosLosUsuarios();
                    request.setAttribute("listaUsuario", listaUsuario);

                    /**
                     * SE GUARDA TODOS LOS REGISTRO QUE ASIGNADO TODOS LOS DATOS
                     * Y LO ENVIA EN LA PAGINA JSP
                     */
                    RequestDispatcher vista = request.getRequestDispatcher("class_espalda.jsp");
                    vista.forward(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (opcion.equals("class_tripces")) {
                try {
                    /**
                     * LISTAR TODOS LOS USUARIOS CREADOS
                     */
                    DAOUsuario daoUsuario = new DAOUsuario();
                    List<Usuario> listaUsuario = daoUsuario.obtenerTodosLosUsuarios();
                    request.setAttribute("listaUsuario", listaUsuario);

                    /**
                     * SE GUARDA TODOS LOS REGISTRO QUE ASIGNADO TODOS LOS DATOS
                     * Y LO ENVIA EN LA PAGINA JSP
                     */
                    RequestDispatcher vista = request.getRequestDispatcher("class_tripces.jsp");
                    vista.forward(request, response);
                } catch (SQLException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void listarRutina(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        try {
            DAORutina daoRutina = new DAORutina();
            List<Rutinas> listaRutina = daoRutina.obtenerTodosLosRegistrosDeRutinas();
            request.setAttribute("listaRutina", listaRutina);
            RequestDispatcher vista = request.getRequestDispatcher("listarRutina.jsp");
            vista.forward(request, response);
        } catch (SQLException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            int cod_rut = Integer.parseInt(request.getParameter("codRtuina"));
            
            int cod_us = Integer.parseInt(request.getParameter("nomUsuario"));
            DAOUsuario daoUsuario = new DAOUsuario();
            String nomUsuario_us = daoUsuario.obtenerElNombreDelUsuarioPor(cod_us);
            
            String cuerpo_corporal_rut = request.getParameter("cuerpo_corporal");
            
            String nombre_rut = request.getParameter("nombre_rut");
            
            int numSeries_rutina = Integer.parseInt(request.getParameter("numSeries"));
            int numRepeticiones_rutina = Integer.parseInt(request.getParameter("numRepeticiones"));
            
            int tiempoRepeticiones_rutina = Integer.parseInt(request.getParameter("timeRepeticiones"));
            String nom_tiempo_repeticiones_rut = request.getParameter("nomTime1");
            
            int tiempoDescanso_rutina = Integer.parseInt(request.getParameter("timeDescansoo"));
            String nom_tiempo_descanso_rut = request.getParameter("nomTime2");
            
            Rutinas rut = new Rutinas(cod_rut, cod_us, nomUsuario_us, cuerpo_corporal_rut, nombre_rut, numSeries_rutina, numRepeticiones_rutina, tiempoRepeticiones_rutina, nom_tiempo_repeticiones_rut, tiempoDescanso_rutina, nom_tiempo_descanso_rut);
            
            DAORutina daoRutina = new DAORutina();
            daoRutina.guardar(rut);
            listarRutina(request, response);
            
        } catch (SQLException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(Rutina.class.getName()).log(Level.SEVERE, null, ex);
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
