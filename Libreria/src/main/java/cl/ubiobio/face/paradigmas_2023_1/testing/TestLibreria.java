package cl.ubiobio.face.paradigmas_2023_1.testing;

import cl.ubiobio.face.paradigmas_2023_1.models.Libro;
import cl.ubiobio.face.paradigmas_2023_1.views.UIPrincipal;

public class TestLibreria {
    public static void main(String[] args) {
        UIPrincipal ui = new UIPrincipal();
        ui.agregarLibro();
        for(Libro libro: Libro.getLibros()){
            System.out.println(libro);
        }
    }
}
