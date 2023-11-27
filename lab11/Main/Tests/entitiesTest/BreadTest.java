package Tests.entitiesTest;

import entities.Bread;
import fillingsTypes.BreadTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BreadTest {

    @Test
    public void testDefaultConstructor() {
        Bread bread = new Bread();
        assertNotNull(bread);
    }

    @Test
    public void testParameterizedConstructor() {
        Bread bread = new Bread(BreadTypeEnum.Integral);
        assertNotNull(bread);
        assertEquals(BreadTypeEnum.Integral, BreadTypeEnum.valueOf(bread.getBreadTypeEnum()));
    }

    @Test
    public void testGetBreadTypeEnum() {
        Bread bread = new Bread(BreadTypeEnum.Frances);
        assertEquals("Frances", bread.getBreadTypeEnum());
    }

}
