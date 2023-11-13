package visitors;
import figuras.Circle;
import figuras.Rectangle;
import figuras.Triangle;
import interfaces.VisitorIF;

public class visitorMaximizar implements VisitorIF  {
    @Override
    public double visitaCirculo(Circle circle) {
        return circle.getRaio() * 2;
    }

    @Override
    public double visitaRetangulo(Rectangle rectangle) {
        return rectangle.getAltura() * 2; 
    }

    @Override
    public double visitaTriangulo(Triangle triangle) {
        return triangle.getAltura() * 2;
    }
}
