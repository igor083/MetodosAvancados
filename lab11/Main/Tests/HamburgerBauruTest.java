package Tests;

import entities.Bread;
import entities.Cheese;
import entities.Egg;
import entities.Ham;
import entities.Tomato;
import entities.hamburguerTypes.HamburgerBauru;
import fillingsTypes.BreadTypeEnum;
import fillingsTypes.CheeseTypeEnum;
import fillingsTypes.EggTypeEnum;
import fillingsTypes.HamTypeEnum;
import fillingsTypes.TomatoTypeEnum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HamburgerBauruTest {

    @Test
    public void testBreadFactory() {
        HamburgerBauru hamburgerBauru = new HamburgerBauru();
        Bread bread = hamburgerBauru.breadFactory();
        assertNotNull(bread);
        assertEquals(BreadTypeEnum.Frances.toString(), bread.getBreadTypeEnum());
    }

    @Test
    public void testCheeseFactory() {
        HamburgerBauru hamburgerBauru = new HamburgerBauru();
        Cheese cheese = hamburgerBauru.cheeseFactory();
        assertNotNull(cheese);
        assertEquals(CheeseTypeEnum.Mussarela.toString(), cheese.getCheeseTypeEnum());
    }

    @Test
    public void testEggFactory() {
        HamburgerBauru hamburgerBauru = new HamburgerBauru();
        Egg egg = hamburgerBauru.eggFactory();
        assertNotNull(egg);
        assertEquals(EggTypeEnum.Granja.toString(), egg.getEggTypeEnum());
    }

    @Test
    public void testHamFactory() {
        HamburgerBauru hamburgerBauru = new HamburgerBauru();
        Ham ham = hamburgerBauru.hamFactory();
        assertNotNull(ham);
        assertEquals(HamTypeEnum.Peru.toString(), (ham).getHamTypeEnum());
    }

    @Test
    public void testTomatoFactory() {
        HamburgerBauru hamburgerBauru = new HamburgerBauru();
        Tomato tomato = hamburgerBauru.tomatoFactory();
        assertNotNull(tomato);
        assertEquals(TomatoTypeEnum.TomateVermelho.toString(), tomato.getTomatoTypeEnum());
    }
}
