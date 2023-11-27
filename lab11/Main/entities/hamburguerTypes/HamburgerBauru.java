package entities.hamburguerTypes;

import entities.*;
import fillingsTypes.*;

public class HamburgerBauru extends Hamburguer {

   
    public HamburgerBauru() {
    }

    @Override
    public Bread breadFactory() {
        return new Bread(BreadTypeEnum.Frances);

    }

    @Override
    public Cheese cheeseFactory() {

        return new Cheese(CheeseTypeEnum.Mussarela);
    }

    @Override
    public Egg eggFactory() {
                return new Egg(EggTypeEnum.Granja);
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