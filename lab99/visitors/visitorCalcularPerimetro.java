package visitors;
import figuras.Circle;
import figuras.Rectangle;
import figuras.Triangle;
import interfaces.VisitorIF;

public class visitorCalcularPerimetro implements VisitorIF  {
    @Override
    public double visitaCirculo(Circle circle) {
        return 2 * 3.14 * circle.getRaio(); //2 * π * r
    }

    @Override
    public double visitaRetangulo(Rectangle rectangle) {
        return 2*rectangle.getAltura() + 2*rectangle.getLargura(); // 2(b+h)
    }

    @Override
    public double visitaTriangulo(Triangle triangle) {
        return triangle.getAltura() + triangle.getBase()+triangle.getLado();
    }
}
