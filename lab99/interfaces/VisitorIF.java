package interfaces;

import figuras.Circle;
import figuras.Rectangle;
import figuras.Triangle;

public interface VisitorIF {
    public double visitaRetangulo(Rectangle rectangle);
    public double visitaTriangulo(Triangle triangle);
    public double visitaCirculo(Circle circle);
}