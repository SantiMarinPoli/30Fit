package modelo;

public class Rutinas {

    private int cod_rut;
    private int cod_us;
    private String nomUsuario_us;
    private String cuerpo_corporal;
    private String nombre_rut;
    private int numSeries_rut;
    private int numRepeticiones_rut;
    private int tiempoRepeticiones_rut;
    private String nom_tiempo_repeticiones_rut;
    private int tiempoDescanso_rut;
    private String nom_tiempo_descanso_rut;

    public Rutinas(int cod_rut, int cod_us, String nomUsuario_us, String cuerpo_corporal, String nombre_rut, int numSeries_rut, int numRepeticiones_rut, int tiempoRepeticiones_rut, String nom_tiempo_repeticiones_rut, int tiempoDescanso_rut, String nom_tiempo_descanso_rut) {
        this.cod_rut = cod_rut;
        this.cod_us = cod_us;
        this.nomUsuario_us = nomUsuario_us;
        this.cuerpo_corporal = cuerpo_corporal;
        this.nombre_rut = nombre_rut;
        this.numSeries_rut = numSeries_rut;
        this.numRepeticiones_rut = numRepeticiones_rut;
        this.tiempoRepeticiones_rut = tiempoRepeticiones_rut;
        this.nom_tiempo_repeticiones_rut = nom_tiempo_repeticiones_rut;
        this.tiempoDescanso_rut = tiempoDescanso_rut;
        this.nom_tiempo_descanso_rut = nom_tiempo_descanso_rut;
    }

    public int getCod_rut() {
        return cod_rut;
    }

    public void setCod_rut(int cod_rut) {
        this.cod_rut = cod_rut;
    }

    public int getCod_us() {
        return cod_us;
    }

    public void setCod_us(int cod_us) {
        this.cod_us = cod_us;
    }

    public String getNomUsuario_us() {
        return nomUsuario_us;
    }

    public void setNomUsuario_us(String nomUsuario_us) {
        this.nomUsuario_us = nomUsuario_us;
    }

    public String getCuerpo_corporal() {
        return cuerpo_corporal;
    }

    public void setCuerpo_corporal(String cuerpo_corporal) {
        this.cuerpo_corporal = cuerpo_corporal;
    }

    public String getNombre_rut() {
        return nombre_rut;
    }

    public void setNombre_rut(String nombre_rut) {
        this.nombre_rut = nombre_rut;
    }

    public int getNumSeries_rut() {
        return numSeries_rut;
    }

    public void setNumSeries_rut(int numSeries_rut) {
        this.numSeries_rut = numSeries_rut;
    }

    public int getNumRepeticiones_rut() {
        return numRepeticiones_rut;
    }

    public void setNumRepeticiones_rut(int numRepeticiones_rut) {
        this.numRepeticiones_rut = numRepeticiones_rut;
    }

    public int getTiempoRepeticiones_rut() {
        return tiempoRepeticiones_rut;
    }

    public void setTiempoRepeticiones_rut(int tiempoRepeticiones_rut) {
        this.tiempoRepeticiones_rut = tiempoRepeticiones_rut;
    }

    public String getNom_tiempo_repeticiones_rut() {
        return nom_tiempo_repeticiones_rut;
    }

    public void setNom_tiempo_repeticiones_rut(String nom_tiempo_repeticiones_rut) {
        this.nom_tiempo_repeticiones_rut = nom_tiempo_repeticiones_rut;
    }

    public int getTiempoDescanso_rut() {
        return tiempoDescanso_rut;
    }

    public void setTiempoDescanso_rut(int tiempoDescanso_rut) {
        this.tiempoDescanso_rut = tiempoDescanso_rut;
    }

    public String getNom_tiempo_descanso_rut() {
        return nom_tiempo_descanso_rut;
    }

    public void setNom_tiempo_descanso_rut(String nom_tiempo_descanso_rut) {
        this.nom_tiempo_descanso_rut = nom_tiempo_descanso_rut;
    }

    @Override
    public String toString() {
        return "Rutinas{" + "cod_rut=" + cod_rut + ", cod_us=" + cod_us + ", nomUsuario_us=" + nomUsuario_us + ", cuerpo_corporal=" + cuerpo_corporal + ", nombre_rut=" + nombre_rut + ", numSeries_rut=" + numSeries_rut + ", numRepeticiones_rut=" + numRepeticiones_rut + ", tiempoRepeticiones_rut=" + tiempoRepeticiones_rut + ", nom_tiempo_repeticiones_rut=" + nom_tiempo_repeticiones_rut + ", tiempoDescanso_rut=" + tiempoDescanso_rut + ", nom_tiempo_descanso_rut=" + nom_tiempo_descanso_rut + '}';
    }
}
