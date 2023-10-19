package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Entities.Circle;

public class CircleTest {
    @Test
    public void testCircleCreation() {
        Circle circle = new Circle();
        assertEquals("Círculo criado", circle.toString());
    }
}