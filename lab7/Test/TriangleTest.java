package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Entities.Triangle;

public class TriangleTest {
    @Test
    public void testIsoscelesTriangleCreation() {
        Triangle triangle = new Triangle("Isosceles");
        assertEquals("Isosceles triângulo criado", triangle.toString());
    }

    @Test
    public void testEquilateralTriangleCreation() {
        Triangle triangle = new Triangle("Equilateral");
        assertEquals("Equilateral triângulo criado", triangle.toString());
    }

    @Test
    public void testRectangleCreation() {
        Triangle triangle = new Triangle("Rectangle");
        assertEquals("Rectangle triângulo criado", triangle.toString());
    }
}