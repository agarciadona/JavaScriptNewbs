package examenJava;

public class Album {

    private String titulo;
    private String artista;
    private int any;
    private String productora;
    private int unidades;

    public Album(String titulo, String artista, int any, String productora, int unidades) {
        this.titulo = titulo;
        this.artista = artista;
        this.any = any;
        this.productora = productora;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Album{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", any=" + any +
                ", productora='" + productora + '\'' +
                ", unidades=" + unidades +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getartista() {
        return artista;
    }

    public int getAny() {
        return any;
    }

    public String getProductora() {
        return productora;
    }

    public int getUnidades() {
        return unidades;
    }
}
