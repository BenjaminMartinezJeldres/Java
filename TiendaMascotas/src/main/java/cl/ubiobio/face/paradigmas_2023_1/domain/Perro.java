package cl.ubiobio.face.paradigmas_2023_1.domain;

public class Perro extends Mascota{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Guau guau guau";
    }
}
