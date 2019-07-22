package modelo;

import java.sql.Date;

public class Usuario {

    private int cod_us;
    private String nombre_us;
    private String apellido_us;
    private String sexo_us;
    private Date fechaNacimiento_us;
    private String correo_us;
    private String nomUsuario_us;
    private String password_us;
    private String numCelular_us;
    private int cod_pais;
    private String pais;
    private String peso_us;
    private String estatura_us;

    public Usuario(int cod_us, String nombre_us, String apellido_us, String sexo_us, Date fechaNacimiento_us, String correo_us, String nomUsuario_us, String password_us, String numCelular_us, int cod_pais, String pais, String peso_us, String estatura_us) {
        this.cod_us = cod_us;
        this.nombre_us = nombre_us;
        this.apellido_us = apellido_us;
        this.sexo_us = sexo_us;
        this.fechaNacimiento_us = fechaNacimiento_us;
        this.correo_us = correo_us;
        this.nomUsuario_us = nomUsuario_us;
        this.password_us = password_us;
        this.numCelular_us = numCelular_us;
        this.cod_pais = cod_pais;
        this.pais = pais;
        this.peso_us = peso_us;
        this.estatura_us = estatura_us;
    }

    public int getCod_us() {
        return cod_us;
    }

    public void setCod_us(int cod_us) {
        this.cod_us = cod_us;
    }

    public String getNombre_us() {
        return nombre_us;
    }

    public void setNombre_us(String nombre_us) {
        this.nombre_us = nombre_us;
    }

    public String getApellido_us() {
        return apellido_us;
    }

    public void setApellido_us(String apellido_us) {
        this.apellido_us = apellido_us;
    }

    public String getSexo_us() {
        return sexo_us;
    }

    public void setSexo_us(String sexo_us) {
        this.sexo_us = sexo_us;
    }

    public Date getFechaNacimiento_us() {
        return fechaNacimiento_us;
    }

    public void setFechaNacimiento_us(Date fechaNacimiento_us) {
        this.fechaNacimiento_us = fechaNacimiento_us;
    }

    public String getCorreo_us() {
        return correo_us;
    }

    public void setCorreo_us(String correo_us) {
        this.correo_us = correo_us;
    }

    public String getNomUsuario_us() {
        return nomUsuario_us;
    }

    public void setNomUsuario_us(String nomUsuario_us) {
        this.nomUsuario_us = nomUsuario_us;
    }

    public String getPassword_us() {
        return password_us;
    }

    public void setPassword_us(String password_us) {
        this.password_us = password_us;
    }

    public String getNumCelular_us() {
        return numCelular_us;
    }

    public void setNumCelular_us(String numCelular_us) {
        this.numCelular_us = numCelular_us;
    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPeso_us() {
        return peso_us;
    }

    public void setPeso_us(String peso_us) {
        this.peso_us = peso_us;
    }

    public String getEstatura_us() {
        return estatura_us;
    }

    public void setEstatura_us(String estatura_us) {
        this.estatura_us = estatura_us;
    }

    @Override
    public String toString() {
        return "usuario{" + "cod_us=" + cod_us + ", nombre_us=" + nombre_us + ", apellido_us=" + apellido_us + ", sexo_us=" + sexo_us + ", fechaNacimiento_us=" + fechaNacimiento_us + ", correo_us=" + correo_us + ", nomUsuario_us=" + nomUsuario_us + ", password_us=" + password_us + ", numCelular_us=" + numCelular_us + ", cod_pais=" + cod_pais + ", pais=" + pais + ", peso_us=" + peso_us + ", estatura_us=" + estatura_us + '}';
    }

}
