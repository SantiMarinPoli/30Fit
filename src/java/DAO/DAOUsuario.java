package DAO;

import modelo.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import utilidades.DBUtil;

public class DAOUsuario {

    private Connection conexion;

    public DAOUsuario() {
        conexion = DBUtil.getConexion();
    }

    public List<Usuario> obtenerTodosLosUsuarios() throws SQLException {
        List<Usuario> listaUsuario = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = " SELECT cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us,\n"
                + "  password_us , numCelular_us, PAIS.cod_pais AS cod_pais , PAIS.nombre_pais AS PAIS, peso_us, estatura_us\n"
                + "  FROM USUARIO \n"
                + "  INNER JOIN PAIS ON USUARIO.cod_pais = PAIS.cod_pais\n"
                + "  ORDER BY USUARIO.cod_us";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            int cod_us = rs.getInt("cod_us");
            String nombre_us = rs.getString("nombre_us");
            String apellido_us = rs.getString("apellido_us");
            String sexo_us = rs.getString("sexo_us");
            Date fechaNacimiento_us = rs.getDate("fechaNacimiento_us");
            String correo_us = rs.getString("correo_us");
            String nomUsuario_us = rs.getString("nomusuario_us");
            String password_us = rs.getString("password_us");
            String numCelular_us = rs.getString("numCelular_us");
            int cod_pais = rs.getInt("cod_pais");
            String pais = rs.getString("PAIS");
            String peso_us = rs.getString("peso_us");
            String estatura_us = rs.getString("estatura_us");

            Usuario u = new Usuario(cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us, password_us, numCelular_us, cod_pais, pais, peso_us, estatura_us);
            listaUsuario.add(u);
        }
        return listaUsuario;
    }

    public Usuario seleccionarUnUsuarioElegidoPor(int cod_us) throws SQLException {

        String sql = "  SELECT cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us,\n"
                + "  password_us , numCelular_us, PAIS.cod_pais AS cod_pais , PAIS.nombre_pais AS PAIS, peso_us, estatura_us\n"
                + "  FROM USUARIO\n"
                + "  INNER JOIN PAIS ON USUARIO.cod_pais = PAIS.cod_pais\n"
                + "  WHERE USUARIO.cod_us=?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, cod_us);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            cod_us = rs.getInt("cod_us");
            String nombre_us = rs.getString("nombre_us");
            String apellido_us = rs.getString("apellido_us");
            String sexo_us = rs.getString("sexo_us");
            Date fechaNacimiento_us = rs.getDate("fechaNacimiento_us");
            String correo_us = rs.getString("correo_us");
            String nomUsuario_us = rs.getString("nomusuario_us");
            String password_us = rs.getString("password_us");
            String numCelular_us = rs.getString("numCelular_us");
            int cod_pais = rs.getInt("cod_pais");
            String pais = rs.getString("PAIS");
            String peso_us = rs.getString("peso_us");
            String estatura_us = rs.getString("estatura_us");

            Usuario u = new Usuario(cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us, password_us, numCelular_us, cod_pais, pais, peso_us, estatura_us);
            return u;
        }
        return null;
    }

    public Usuario seleccionarUnNombreUsuarioElegidoPor(String nomUsuario_us) throws SQLException {

        String sql = "  SELECT cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us,\n"
                + "  password_us , numCelular_us, PAIS.cod_pais AS cod_pais , PAIS.nombre_pais AS PAIS, peso_us, estatura_us\n"
                + "  FROM USUARIO\n"
                + "  INNER JOIN PAIS ON USUARIO.cod_pais = PAIS.cod_pais\n"
                + "  WHERE USUARIO.nomUsuario_us=?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nomUsuario_us);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int cod_us = rs.getInt("cod_us");
            String nombre_us = rs.getString("nombre_us");
            String apellido_us = rs.getString("apellido_us");
            String sexo_us = rs.getString("sexo_us");
            Date fechaNacimiento_us = rs.getDate("fechaNacimiento_us");
            String correo_us = rs.getString("correo_us");
            nomUsuario_us = rs.getString("nomusuario_us");
            String password_us = rs.getString("password_us");
            String numCelular_us = rs.getString("numCelular_us");
            int cod_pais = rs.getInt("cod_pais");
            String pais = rs.getString("PAIS");
            String peso_us = rs.getString("peso_us");
            String estatura_us = rs.getString("estatura_us");

            Usuario u = new Usuario(cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us, password_us, numCelular_us, cod_pais, pais, peso_us, estatura_us);
            return u;
        }
        return null;
    }

    public String obtenerElNombreDelUsuarioPor(int cod_us) throws SQLException {
        String sql = "SELECT * FROM USUARIO WHERE COD_US =?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, cod_us);
        ResultSet rs = ps.executeQuery();

        String nombreUsuario = null;
        if (rs.next()) {
            String nomUsuario_us = rs.getString("nomUsuario_us");
        }
        return nombreUsuario;
    }

    public void guardar(Usuario u) throws SQLException {

        String sql = "    INSERT INTO USUARIO(nombre_us, apellido_us, sexo_us, fechaNacimiento_us, \n"
                + "  correo_us, nomUsuario_us, password_us, numCelular_us, cod_pais,estatura_us, peso_us)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setString(1, u.getNombre_us());
        ps.setString(2, u.getApellido_us());
        ps.setString(3, u.getSexo_us());
        ps.setDate(4, u.getFechaNacimiento_us());
        ps.setString(5, u.getCorreo_us());
        ps.setString(6, u.getNomUsuario_us());
        ps.setString(7, u.getPassword_us());
        ps.setString(8, u.getNumCelular_us());
        ps.setInt(9, u.getCod_pais());
        ps.setString(10, u.getPeso_us());
        ps.setString(11, u.getEstatura_us());
        ps.executeUpdate();
    }

    public boolean iniciarSesion(String nomUsuario_us, String password_us) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT * FROM USUARIO WHERE nomUsuario_us = ? AND password_us = ?";
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, nomUsuario_us);
            ps.setString(2, password_us);
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }

                if (ps != null) {
                    ps.close();
                }

                if (rs != null) {
                    rs.close();
                }

            } catch (Exception ex) {
                System.err.println("ERROR " + ex);
            }
        }

        return false;
    }

    public void borrar(int cod_us) throws SQLException {
        String sql = "DELETE FROM USUARIO WHERE COD_US=?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, cod_us);
        ps.executeUpdate();
    }

    public void editar(Usuario u) throws SQLException {
        String sql = " UPDATE USUARIO SET COD_US=? ,NOMBRE_US =? ,APELLIDO_US=?,SEXO_US=?,fechaNacimiento_us =?,\n"
                + " CORREO_US =?,NOMUSUARIO_US =?,PASSWORD_US =?, NUMCELULAR_US =?, COD_PAIS=?,PESO_US =?, ESTATURA_US =?\n"
                + " WHERE COD_US =?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, u.getCod_us());
        ps.setString(2, u.getNombre_us());
        ps.setString(3, u.getApellido_us());
        ps.setString(4, u.getSexo_us());
        ps.setDate(5, u.getFechaNacimiento_us());
        ps.setString(6, u.getCorreo_us());
        ps.setString(7, u.getNomUsuario_us());
        ps.setString(8, u.getPassword_us());
        ps.setString(9, u.getNumCelular_us());
        ps.setInt(10, u.getCod_pais());
        ps.setString(11, u.getPeso_us());
        ps.setString(12, u.getEstatura_us());
        ps.executeUpdate();
    }

}
