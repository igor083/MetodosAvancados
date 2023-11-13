package figuras;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

public class Rectangle implements ElementoConcretoIF {
    private double altura;
    private double largura;

    public Rectangle (double altura, double largura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void aceitaVisita(VisitorIF visitorIF) {
        double result = visitorIF.visitaRetangulo(this);

        System.err.println("Rectangle: " + result);
    }

    public double getAltura() {
      return altura;
    }

    public double getLargura() {
      return largura;
    }
}
