
package Tests;
import entities.Bread;
import entities.Cheese;
import entities.Egg;
import entities.Ham;
import entities.Tomato;
import entities.hamburguerTypes.HamburgerFitness;
import fillingsTypes.BreadTypeEnum;
import fillingsTypes.CheeseTypeEnum;
import fillingsTypes.EggTypeEnum;
import fillingsTypes.HamTypeEnum;
import fillingsTypes.TomatoTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HamburguerFitnessTest {

    @Test
    public void testBreadFactory() {
        HamburgerFitness hamburgerFitness = new HamburgerFitness();
        Bread bread = hamburgerFitness.breadFactory();
        assertNotNull(bread);
        assertEquals(BreadTypeEnum.Integral.toString(), bread.getBreadTypeEnum());
    }

    @Test
    public void testCheeseFactory() {
        HamburgerFitness hamburgerFitness = new HamburgerFitness();
        Cheese cheese = hamburgerFitness.cheeseFactory();
        assertNotNull(cheese);
        assertEquals(CheeseTypeEnum.Ricota.toString(), cheese.getCheeseTypeEnum());
    }

    @Test
    public void testEggFactory() {
        HamburgerFitness hamburgerFitness = new HamburgerFitness();
        Egg egg = hamburgerFitness.eggFactory();
        assertNotNull(egg);
        assertEquals(EggTypeEnum.Capoeira.toString(), egg.getEggTypeEnum());
    }

    @Test
    public void testHamFactory() {
        HamburgerFitness hamburgerFitness = new HamburgerFitness();
        Ham ham = hamburgerFitness.hamFactory();
        assertNotNull(ham);
        assertEquals(HamTypeEnum.Peru.toString(), ham.getHamTypeEnum());
    }

    @Test
    public void testTomatoFactory() {
        HamburgerFitness hamburgerFitness = new HamburgerFitness();
        Tomato tomato = hamburgerFitness.tomatoFactory();
        assertNotNull(tomato);
        assertEquals(TomatoTypeEnum.TomateVermelho.toString(), tomato.getTomatoTypeEnum());
    }
}
