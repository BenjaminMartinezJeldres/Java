package herencia;

public class Circulo extends FiguraBidimensional{
    private double radio;
    private final double PI = 3.1415926;

    // Calcular area y perimetro forzando al usuario a ingresar
    // el radio mediante el constructor
    public Circulo(double radio){
        this.radio = radio;
        this.calcularArea();
        this.calcularPerimetro();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        // Calcular el area modificando set
//        this.calcularArea();
    }

    private void calcularArea(){
        this.setArea(this.PI*this.radio*this.radio);
    }

    private void calcularPerimetro() {
        this.setPerimetro(this.PI*2*this.radio);
    }

    //Calcular el area modificando el getter del area
    /*
    @Override
    public double getArea(){
        this.calcularArea();
        return super.getArea();
    }
    */
}
