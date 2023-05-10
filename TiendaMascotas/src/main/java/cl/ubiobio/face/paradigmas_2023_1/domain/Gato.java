package cl.ubiobio.face.paradigmas_2023_1.domain;

public class Gato extends Mascota{
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Miaaauuuuu";
    }

    public String ronronear() {
        return "Rrrrrrrrr";
    }
}
