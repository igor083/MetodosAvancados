package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import figuras.Circle;


public class CircleTest {

   @Test
   public void testGetRaio() {
      Circle circle = new Circle(5);
      double raio = circle.getRaio();
      assertEquals(5, raio, 0);
   }
}
