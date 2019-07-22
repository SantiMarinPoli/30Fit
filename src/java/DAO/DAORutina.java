package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import modelo.Rutinas;
import utilidades.DBUtil;

public class DAORutina {

    private Connection conexion;

    public DAORutina() {
        conexion = DBUtil.getConexion();
    }

    public List<Rutinas> obtenerTodosLosRegistrosDeRutinas() throws SQLException {
        List<Rutinas> listaRutina = new LinkedList<>();
        Statement stmt = conexion.createStatement();
        String sql = " SELECT cod_rut, USUARIO.cod_us AS cod_us, USUARIO.NOMUSUARIO_US AS USUARIO,cuerpo_corporal_rut,nombre_rut,\n"
                + " numSeries_rut,numRepeticiones_rut,\n"
                + " tiempoRepeticiones_rut,nom_time1_rut,tiempoDescanso_rut,nom_time2_rut\n"
                + " FROM RUTINA\n"
                + " INNER JOIN USUARIO ON RUTINA.cod_us = USUARIO.cod_us\n"
                + " ORDER BY RUTINA.cod_us";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int cod_rut = rs.getInt("cod_rut");
            int cod_us = rs.getInt("cod_us");
            String nomUsuario_us = rs.getString("USUARIO");
            String cuerpo_corporal_rut = rs.getString("cuerpo_corporal_rut");
            String nombre_nomRut = rs.getString("nombre_rut");
            int numSeries_rut = rs.getInt("numSeries_rut");
            int numRepeticiones_rut = rs.getInt("numRepeticiones_rut");
            int tiempoRepeticiones_rut = rs.getInt("tiempoRepeticiones_rut");
            String nom_tiempo_repeticiones_rut = rs.getString("nom_time1_rut");
            int tiempoDescanso_rut = rs.getInt("tiempoDescanso_rut");
            String nom_tiempo_descanso_rut = rs.getString("nom_time2_rut");

            Rutinas rut = new Rutinas(cod_rut, cod_us, nomUsuario_us, cuerpo_corporal_rut, nombre_nomRut, numSeries_rut, numRepeticiones_rut, tiempoRepeticiones_rut, nom_tiempo_repeticiones_rut, tiempoDescanso_rut, nom_tiempo_descanso_rut);
            listaRutina.add(rut);
        }
        return listaRutina;
    }

    public void guardar(Rutinas rut) throws SQLException {
        String sql = "INSERT INTO RUTINA(cod_us,cuerpo_corporal_rut,nombre_rut,numSeries_rut,numRepeticiones_rut,tiempoRepeticiones_rut,nom_time1_rut,tiempoDescanso_rut,nom_time2_rut)\n"
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setInt(1, rut.getCod_us());
        ps.setString(2, rut.getCuerpo_corporal());
        ps.setString(3, rut.getNombre_rut());
        ps.setInt(4, rut.getNumSeries_rut());
        ps.setInt(5, rut.getNumRepeticiones_rut());
        ps.setInt(6, rut.getTiempoRepeticiones_rut());
        ps.setString(7, rut.getNom_tiempo_repeticiones_rut());
        ps.setInt(8, rut.getTiempoDescanso_rut());
        ps.setString(9, rut.getNom_tiempo_repeticiones_rut());
        ps.executeUpdate();
    }

    public void borrar(int cod_rut) throws SQLException {
        String sql = "DELETE FROM RUTINA WHERE COD_RUT=?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, cod_rut);
        ps.executeUpdate();
    }

}
