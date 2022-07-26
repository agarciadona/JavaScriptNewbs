package ejercicios;

public class superheroe {

    private String nombre,pais,poderes;
    private int puntos;

    public superheroe(String nombre, String pais, String poderes, int puntos) {
        this.nombre = nombre;
        this.pais = pais;
        this.poderes = poderes;
        this.puntos = puntos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
