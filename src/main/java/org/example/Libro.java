package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double precio;

    Libro(String titulo, String autor, int paginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", precio=" + precio +
                '}';
    }
}
