package figuras;
import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

public class Triangle implements ElementoConcretoIF {
    double base;
    double altura;
    double lado;

    public Triangle(double base, double altura,double lado) {
        this.base = base;
        this.altura = altura;
        this.lado=lado;
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
    public double getLado() {
      return lado;
    }
}
