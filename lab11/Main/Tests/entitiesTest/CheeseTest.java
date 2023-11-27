package Tests.entitiesTest;
import entities.Cheese;
import fillingsTypes.CheeseTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CheeseTest {

    @Test
    public void testDefaultConstructor() {
        Cheese cheese = new Cheese();
        assertNotNull(cheese);
    }

    @Test
    public void testParameterizedConstructor() {
        Cheese cheese = new Cheese(CheeseTypeEnum.Mussarela);
        assertNotNull(cheese);
        assertEquals(CheeseTypeEnum.Mussarela, CheeseTypeEnum.valueOf(cheese.getCheeseTypeEnum()));
    }

    @Test
    public void testGetCheeseTypeEnum() {
        Cheese cheese = new Cheese(CheeseTypeEnum.Cheddar);
        assertEquals("Cheddar", cheese.getCheeseTypeEnum());
    }

   
}
