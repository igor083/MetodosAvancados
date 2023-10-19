package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Entities.Square;

public class SquareTest {
    @Test
    public void testSquareCreation() {
        Square square = new Square();
        assertEquals("Quadrado criado", square.toString());
    }
}
