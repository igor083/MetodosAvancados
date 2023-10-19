package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import Entities.GeometricShapeFactory;
import Entities.Circle;
import Entities.Square;
import Entities.Triangle;

public class GeometricShapeFactoryTest {
    private GeometricShapeFactory factory;

    @Before
    public void setUp() {
        factory = GeometricShapeFactory.getInstance();
    }

    @Test
    public void testGetInstance() {
        GeometricShapeFactory anotherFactory = GeometricShapeFactory.getInstance();
        assertSame("As instâncias devem ser as mesmas", factory, anotherFactory);
    }

    @Test
    public void testCreateCircle() {
        Circle circle = factory.createCircle();
        assertEquals("Círculo criado", circle.toString());
    }

    @Test
    public void testCreateIsoscelesTriangle() {
        Triangle triangle = factory.createIsoscelesTriangle();
        assertEquals("Isosceles triângulo criado", triangle.toString());
    }

    @Test
    public void testCreateEquilateralTriangle() {
        Triangle triangle = factory.createEquilateralTriangle();
        assertEquals("Equilateral triângulo criado", triangle.toString());
    }

    @Test
    public void testCreateRectangle() {
        Triangle triangle = factory.createRectangle();
        assertEquals("Rectangle triângulo criado", triangle.toString());
    }

    @Test
    public void testCreateSquare() {
        Square square = factory.createSquare();
        assertEquals("Quadrado criado", square.toString());
    }
}
