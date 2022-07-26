package ejercicios;

public class moto {
    private String marca;
    private String modelo;
    private int potencia;
    private String color;

    public moto() {
    }

    public moto(String marca, String modelo, int potencia, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                " CV, color='" + color + '\'' +
                '}';
    }
}

