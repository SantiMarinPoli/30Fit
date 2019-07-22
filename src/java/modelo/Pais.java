
package modelo;

public class Pais {
    private int cod_pais;
    private String nombre_pais;

    public Pais(int cod_pais, String nombre_pais) {
        this.cod_pais = cod_pais;
        this.nombre_pais = nombre_pais;
    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    
}
