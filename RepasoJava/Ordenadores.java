package ejercicios;

public class Ordenadores {

    private double precio, capacidad,RAM;
    private String Grafica;
    private String so;

    private boolean oferta;

    public Ordenadores(double precio, double capacidad, double RAM, String grafica, String so, boolean oferta) {
        this.precio = precio;
        this.capacidad = capacidad;
        this.RAM = RAM;
        Grafica = grafica;
        this.so = so;
        this.oferta = oferta;
    }

    public Ordenadores(double precio, int capacidad, int RAM, String grafica, String so) {
        this.precio = precio;
        this.capacidad = capacidad;
        this.RAM = RAM;
        this.Grafica = grafica;
        this.so = so;
    }


    @Override
    public String toString() {
        if(oferta) {
            return "Especificaciones Ordenador: " +
                    "precio: " + precio + " euros" +
                    ", capacidad: " + capacidad + " GB " +
                    ", RAM: " + RAM + " GB " +
                    ", Grafica: " + Grafica +
                    ", Sistema Operativo: " + so +
                    " mas raton gaming de regalo";
        }
        else{
            return "Especificaciones Ordenador: " +
                    "precio: " + precio + " euros" +
                    ", capacidad: " + capacidad + " GB " +
                    ", RAM: " + RAM + " GB " +
                    ", Grafica: " + Grafica +
                    ", Sistema Operativo: " + so;
            }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public String getGrafica() {
        return Grafica;
    }

    public void setGrafica(String grafica) {
        Grafica = grafica;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }
}
