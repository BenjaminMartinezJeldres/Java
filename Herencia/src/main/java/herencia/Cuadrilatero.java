package herencia;

public class Cuadrilatero extends FiguraBidimensional{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;
    private double alpha;
    private double beta;
    private double gamma;
    private double epsilon;

    protected void calcularArea(){
        this.setArea(
                (ladoA*ladoB*Math.sin(alpha) + ladoC*ladoD*Math.sin(gamma))/2
        );
    }
}
