package cl.ubiobio.face.paradigmas_2023_1.controllers;

import cl.ubiobio.face.paradigmas_2023_1.models.Libro;
import cl.ubiobio.face.paradigmas_2023_1.views.UIPrincipal;

import java.util.ArrayList;

public class LibreriaController {
    public void operarMenu(int opcion){
        UIPrincipal ui = new UIPrincipal();
        switch (opcion){
            case 1:
                ui.agregarLibro();
                break;
            case 2:
                ui.buscarLibro();
                break;
        }
    }

    public void agregarLibro(Libro libro){
        Libro.getLibros().add(libro);
    }

    public void buscarlibro(String busqueda){
        Libro libro = new Libro();
        ArrayList<Libro> libros = libro.buscar(busqueda);
        UIPrincipal ui = new UIPrincipal();
        ui.mostrarlibros(libros);
    }
}
