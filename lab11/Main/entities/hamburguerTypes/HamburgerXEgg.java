package entities.hamburguerTypes;

import entities.*;
import fillingsTypes.*;

public class HamburgerXEgg extends Hamburguer {

    @Override
    public Bread breadFactory() {

        return new Bread(BreadTypeEnum.Bola);
    }

    @Override
    public Cheese cheeseFactory() {

        return new Cheese(CheeseTypeEnum.Cheddar);
    }

    @Override
    public Egg eggFactory() {

        return new Egg(EggTypeEnum.Capoeira);
    }

    @Override
    public Ham hamFactory() {

        return new Ham(HamTypeEnum.Peru);
    }

    @Override
    public Tomato tomatoFactory() {

        return new Tomato(TomatoTypeEnum.TomateVermelho);
    }

    public void setBread(Bread breadFactory) {
    }

    public void setCheese(Cheese cheeseFactory) {
    }

    public void setHam(Ham hamFactory) {
    }

    public void setEgg(Egg eggFactory) {
    }

    public void setTomato(Tomato tomatoFactory) {
    }
}
