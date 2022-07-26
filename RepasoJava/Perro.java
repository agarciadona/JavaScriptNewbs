package ejercicios;

public class Perro {

    private String nombre;
    private double peso;
    private double altura;
    private String raza;


    public Perro(String nombre, double peso, double altura, String raza) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.raza = raza;
    }

    public String descripcion() {
        return "Descripcion de " + nombre +": " + "Peso: " + peso + ", altura:" + altura + " cm, raza: " + raza + ", me gusta correr";
    }

    public String descripcion(double recorrido){

        return "Descripcion de " + nombre +": " + "Peso: " + peso + ", altura:" + altura + " cm, raza: " + raza + ", y ademas hoy a recorrido "+recorrido+" km.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}