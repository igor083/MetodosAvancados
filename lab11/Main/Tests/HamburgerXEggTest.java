package Tests;

import entities.Bread;
import entities.Cheese;
import entities.Egg;
import entities.Ham;
import entities.Tomato;
import entities.hamburguerTypes.HamburgerXEgg;
import fillingsTypes.BreadTypeEnum;
import fillingsTypes.CheeseTypeEnum;
import fillingsTypes.EggTypeEnum;
import fillingsTypes.HamTypeEnum;
import fillingsTypes.TomatoTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HamburgerXEggTest {

    @Test
    public void testBreadFactory() {
        HamburgerXEgg hamburgerXEgg = new HamburgerXEgg();
        Bread bread = hamburgerXEgg.breadFactory();
        assertNotNull(bread);
        assertEquals(BreadTypeEnum.Bola.toString(), bread.getBreadTypeEnum());
    }

    @Test
    public void testCheeseFactory() {
        HamburgerXEgg hamburgerXEgg = new HamburgerXEgg();
        Cheese cheese = hamburgerXEgg.cheeseFactory();
        assertNotNull(cheese);
        assertEquals(CheeseTypeEnum.Cheddar.toString(), cheese.getCheeseTypeEnum());
    }

    @Test
    public void testEggFactory() {
        HamburgerXEgg hamburgerXEgg = new HamburgerXEgg();
        Egg egg = hamburgerXEgg.eggFactory();
        assertNotNull(egg);
        assertEquals(EggTypeEnum.Capoeira.toString(), egg.getEggTypeEnum());
    }

    @Test
    public void testHamFactory() {
        HamburgerXEgg hamburgerXEgg = new HamburgerXEgg();
        Ham ham = hamburgerXEgg.hamFactory();
        assertNotNull(ham);
        assertEquals(HamTypeEnum.Peru.toString(), ham.getHamTypeEnum());
    }

    @Test
    public void testTomatoFactory() {
        HamburgerXEgg hamburgerXEgg = new HamburgerXEgg();
        Tomato tomato = hamburgerXEgg.tomatoFactory();
        assertNotNull(tomato);
        assertEquals(TomatoTypeEnum.TomateVermelho.toString(), tomato.getTomatoTypeEnum());
    }
}
