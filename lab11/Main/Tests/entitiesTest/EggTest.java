package Tests.entitiesTest;

import entities.Egg;
import fillingsTypes.EggTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EggTest {

    @Test
    public void testDefaultConstructor() {
        Egg egg = new Egg();
        assertNotNull(egg);
    }

    @Test
    public void testParameterizedConstructor() {
        Egg egg = new Egg(EggTypeEnum.Granja);
        assertNotNull(egg);
        assertEquals(EggTypeEnum.Granja, EggTypeEnum.valueOf(egg.getEggTypeEnum()));
    }

    @Test
    public void testGetEggTypeEnum() {
        Egg egg = new Egg(EggTypeEnum.Capoeira);
        assertEquals("Capoeira", egg.getEggTypeEnum());
    }

}
