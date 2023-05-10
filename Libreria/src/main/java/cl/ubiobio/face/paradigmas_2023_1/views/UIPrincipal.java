package cl.ubiobio.face.paradigmas_2023_1.views;

import cl.ubiobio.face.paradigmas_2023_1.controllers.LibreriaController;
import cl.ubiobio.face.paradigmas_2023_1.models.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class UIPrincipal {
    private Scanner sc;

    public UIPrincipal(){
        this.sc = new Scanner(System.in);
    }
    public void mostrarMenu(){
        int opcion;
        LibreriaController lb = new LibreriaController();
        do {
            System.out.println("1. Agregar libro:");
            System.out.println("2. Buscar libro:");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(sc.nextLine());
            lb.operarMenu(opcion);
        } while ( opcion != 0 );
        sc.close();
    }

    public void agregarLibro(){
        Libro libro = new Libro();
        System.out.println("Ingrese titulo:");
        libro.setTitulo(this.sc.nextLine());
        System.out.println("Ingrese autor:");
        libro.setAutor(this.sc.nextLine());
        System.out.println("Ingrese ISBN:");
        libro.setIsbn(this.sc.nextLine());
        System.out.println("Ingrese editorial:");
        libro.setEditorial(this.sc.nextLine());
        LibreriaController lb = new LibreriaController();
        lb.agregarLibro(libro);
    }

    public void buscarLibro(){
        String busqueda;
        System.out.println("Ingrese titulo o autor:");
        busqueda = this.sc.nextLine();
        LibreriaController lb = new LibreriaController();
        lb.buscarlibro(busqueda);
    }

    public void mostrarlibros(ArrayList<Libro> libros){
        for (Libro libro: libros){
            System.out.println(libro.toString());
        }
    }
}
