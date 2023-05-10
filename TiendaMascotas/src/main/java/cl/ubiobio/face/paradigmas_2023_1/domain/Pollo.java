package cl.ubiobio.face.paradigmas_2023_1.domain;

public class Pollo extends Mascota{
    public Pollo(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Pio pio pio";
    }
}
