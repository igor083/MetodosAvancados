package Tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import figuras.Triangle;


public class TriangleTest {



    @Test
    public void testGetAltura() {
        Triangle triangle = new Triangle(4, 5,4);
        double altura = triangle.getAltura();
        assertEquals(5, altura, 0.01); 
    }

    @Test
    public void testGetBase() {
        Triangle triangle = new Triangle(4, 5,4);
        double base = triangle.getBase();
        assertEquals(4, base, 0.01); 
    }
    @Test
    public void testGetLado() {
        Triangle triangle = new Triangle(4, 5,4);
        double base = triangle.getLado();
        assertEquals(4, base, 0.01); 
    }
}
