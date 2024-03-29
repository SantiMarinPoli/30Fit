package controlador;

import DAO.DAOUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

public class login extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String nomUsuario_us = request.getParameter("nomUsuario");
        String password_us = request.getParameter("password");

        DAOUsuario daoUsuario = new DAOUsuario();

        if (daoUsuario.iniciarSesion(nomUsuario_us, password_us)) {

            HttpSession objSesion = request.getSession(true);
            objSesion.setAttribute("nomUsuario_us", nomUsuario_us);

            perfil(request, response);
            response.sendRedirect("perfil.jsp");
        } else {
            response.sendRedirect("index.jsp");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
            processRequest(request, response);
        } catch (SQLException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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

    private void perfil(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

}
