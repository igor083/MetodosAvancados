package Tests.entitiesTest;
import entities.Ham;
import fillingsTypes.HamTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HamTest {

    @Test
    public void testDefaultConstructor() {
        Ham ham = new Ham();
        assertNotNull(ham);
    }

    @Test
    public void testParameterizedConstructor() {
        Ham ham = new Ham(HamTypeEnum.Peru);
        assertNotNull(ham);
        assertEquals(HamTypeEnum.Peru, HamTypeEnum.valueOf(ham.getHamTypeEnum()));
    }

    @Test
    public void testGetHamTypeEnum() {
        Ham ham = new Ham(HamTypeEnum.Peru);
        assertEquals("Peru", ham.getHamTypeEnum());
    }


}
