package Tests.entitiesTest;

import entities.Tomato;
import fillingsTypes.TomatoTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TomatoTest {

    @Test
    public void testDefaultConstructor() {
        Tomato tomato = new Tomato();
        assertNotNull(tomato);
    }

    @Test
    public void testParameterizedConstructor() {
        Tomato tomato = new Tomato(TomatoTypeEnum.TomateVermelho);
        assertNotNull(tomato);
        assertEquals(TomatoTypeEnum.TomateVermelho, TomatoTypeEnum.valueOf(tomato.getTomatoTypeEnum()));
    }

    @Test
    public void testGetTomatoTypeEnum() {
        Tomato tomato = new Tomato(TomatoTypeEnum.TomateVermelho);
        assertEquals("TomateVermelho", tomato.getTomatoTypeEnum());
    }

    // You can add more tests as needed for your specific requirements
}
