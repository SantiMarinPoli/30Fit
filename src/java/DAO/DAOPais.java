package DAO;

import modelo.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import utilidades.DBUtil;

public class DAOPais {

    private Connection conexion;

    public DAOPais() {
        conexion = DBUtil.getConexion();
    }

    public List<Pais> ontenerTodosLosPaises() throws SQLException {
        List<Pais> listaPais = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT * FROM PAIS";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int cod_pais = rs.getInt("cod_pais");
            String nombre_pais = rs.getString("nombre_pais");

            Pais pais = new Pais(cod_pais, nombre_pais);
            listaPais.add(pais);
        }
        return listaPais;
    }

    public String obtenerNombrePaisPor(int cod_pais) throws SQLException {
        String sql = "SELECT * FROM PAIS WHERE cod_pais =?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, cod_pais);
        ResultSet rs = ps.executeQuery();

        String nombrePais = null;
        if (rs.next()) {
            String nombre_pais = rs.getString("nombre_pais");
        }

        return nombrePais;
    }

}
