package figuras;
import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

public class Triangle implements ElementoConcretoIF {
    double base;
    double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void aceitaVisita(VisitorIF visitorIF) {
        double result = visitorIF.visitaTriangulo(this);
        
        System.err.println("Triangle: " + result);
    }

    public double getAltura() {
      return altura;
    }

    public double getBase() {
      return base;
    }
}
