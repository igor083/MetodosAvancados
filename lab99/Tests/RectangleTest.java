package Tests;

import org.junit.Test;

import figuras.Rectangle;

public class RectangleTest {


    @Test
    public void testGetAltura() {
        Rectangle rectangle = new Rectangle(5, 7);
        double altura = rectangle.getAltura();
        AssertEquals(5, altura, 0); 
    }

    private void AssertEquals(int i, double altura, double d) {
   }

   @Test
    public void testGetLargura() {
        Rectangle rectangle = new Rectangle(5, 7);
        double largura = rectangle.getLargura();
        AssertEquals(7, largura, 0); 
    }
}
