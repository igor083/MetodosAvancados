package figuras;
import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

public class Circle implements ElementoConcretoIF {
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public void aceitaVisita(VisitorIF visitorIF) {
        double result = visitorIF.visitaCirculo(this);

        System.err.println("Circulo: " + result);
    }
}
