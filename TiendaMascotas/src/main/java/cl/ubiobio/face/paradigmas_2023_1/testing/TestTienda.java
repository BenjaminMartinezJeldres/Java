package cl.ubiobio.face.paradigmas_2023_1.testing;

import cl.ubiobio.face.paradigmas_2023_1.domain.*;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class TestTienda {
    public static void main(String[] args) throws InterruptedException {
//        Mascota m = new Perro("Pelusa");
//        System.out.println(
//                m.getNombre() +
//                " hace " +
//                m.emitirSonido());
//
//        m = new Gato("Kitty");
//        System.out.println(
//                m.getNombre() +
//                " hace " +
//                m.emitirSonido());

        // Esto NO se puede hacer
        // La variable tiene que ser una Superclase
        // y la instancia puede ser una Subclase
//        Gato g = new Mascota("Kitty");


        // Esto NO se puede hacer
        // La variable del tipo de una Superclase
        // no puede acceder a un método exclusivo
        // de una instancia de una Subclase
//        Mascota m = new Gato("Kitty");
//        m.ronronear();


        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro("Pelusa"));
        mascotas.add(new Gato("Kitty"));
        mascotas.add(new Perro("Roco"));
        mascotas.add(new Tortuga("Terminator"));
        mascotas.add(new Pollo("Saltarin"));
        mascotas.add(new Gato("Blanquito"));
        mascotas.add(new Tortuga("Rocky"));
        mascotas.add(new Perro("Peludo"));

        System.out.println("Entro a la tienda y escucho\n");

        for (int i = 0; i < 15; i++) {
            int indice = (int)(Math.random()*10)%8;
            long milisegundos = (long)(Math.random()*1000)%800 + 200;
            System.out.println(
                    mascotas.get(indice).getNombre() +
                    " hace " +
                    mascotas.get(indice).emitirSonido()
            );
            sleep(milisegundos);
        }

        System.out.println("\nSali de la tienda");
    }
}
