package visitors;
import figuras.Circle;
import figuras.Rectangle;
import figuras.Triangle;
import interfaces.VisitorIF;

public class visitorCalcularArea implements VisitorIF  {
    @Override
    public double visitaCirculo(Circle circle) {
        return 2 * 3.14 * circle.getRaio();
    }

    @Override
    public double visitaRetangulo(Rectangle rectangle) {
        return rectangle.getLargura() * rectangle.getAltura();
    }

    @Override
    public double visitaTriangulo(Triangle triangle) {
        return (triangle.getBase()*triangle.getAltura()) / 2;
    }
}
