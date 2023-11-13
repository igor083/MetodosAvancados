package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import figuras.Circle;
import figuras.Rectangle;
import figuras.Triangle;
import interfaces.VisitorIF;
import visitors.visitorMaximizar;

public class VisitorMaximizarTest {

    @Test
    public void testVisitaCirculo() {
        Circle circle = new Circle(5);
        VisitorIF visitor = new visitorMaximizar();
        double result = visitor.visitaCirculo(circle);
        assertEquals(5 * 2, result, 0);
    }

    @Test
    public void testVisitaRetangulo() {
        Rectangle rectangle = new Rectangle(4, 6);
        VisitorIF visitor = new visitorMaximizar();
        double result = visitor.visitaRetangulo(rectangle);
        assertEquals(4 * 2, result, 0);
    }

    @Test
    public void testVisitaTriangulo() {
        Triangle triangle = new Triangle(3, 4, 4);
        VisitorIF visitor = new visitorMaximizar();
        double result = visitor.visitaTriangulo(triangle);
        assertEquals(4 * 2, result, 0);
    }
}
