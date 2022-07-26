package ejercicios;

import java.util.PrimitiveIterator;

public class cliente {

    private String nombre;
    private String apellido;
    private int NumCuenta;
    private double saldo;

    public String cosa;

    public cliente(String nombre, String apellido, int numCuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        NumCuenta = numCuenta;
        this.saldo = saldo;
    }

    public cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        NumCuenta = numCuenta;
    }
}
