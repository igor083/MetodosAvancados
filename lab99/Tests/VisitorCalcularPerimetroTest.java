package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import figuras.Circle;
import figuras.Rectangle;
import figuras.Triangle;
import interfaces.VisitorIF;
import visitors.visitorCalcularPerimetro;

public class VisitorCalcularPerimetroTest {

    @Test
    public void testVisitaCirculo() {
        Circle circle = new Circle(5);
        VisitorIF visitor = new visitorCalcularPerimetro();
        double result = visitor.visitaCirculo(circle);
        assertEquals(2 * 3.14 * 5, result, 0.01);
    }

    @Test
    public void testVisitaRetangulo() {
        Rectangle rectangle = new Rectangle(4, 6);
        VisitorIF visitor = new visitorCalcularPerimetro();
        double result = visitor.visitaRetangulo(rectangle);
        assertEquals(2 * (4 + 6), result, 0.01);
    }

    @Test
    public void testVisitaTriangulo() {
        Triangle triangle = new Triangle(3, 4, 4);
        VisitorIF visitor = new visitorCalcularPerimetro();
        double result = visitor.visitaTriangulo(triangle);
        assertEquals(3 + 4 + 4, result, 0);
    }
}
