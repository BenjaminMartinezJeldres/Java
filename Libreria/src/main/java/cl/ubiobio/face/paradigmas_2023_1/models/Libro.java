package cl.ubiobio.face.paradigmas_2023_1.models;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private static ArrayList<Libro> libros = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public static ArrayList<Libro> getLibros() {
        return libros;
    }

    public static void setLibros(ArrayList<Libro> libros) {
        Libro.libros = libros;
    }

    public ArrayList<Libro> buscar(String busqueda){
        ArrayList<Libro> libros = new ArrayList<>();
        for (Libro libro: Libro.getLibros()) {
            if ( libro.getAutor().toLowerCase().contains(busqueda.toLowerCase()) ||
                    libro.getTitulo().toLowerCase().contains(busqueda.toLowerCase()) ) {
                libros.add(libro);
            }
        }
        return libros;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
