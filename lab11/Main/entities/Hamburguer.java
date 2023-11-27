package entities;

import fillingsTypes.*;

abstract public class Hamburguer {

    private Bread bread;
    private Cheese cheese;
    private Egg egg;
    private Ham ham;
    private Tomato tomato;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "bread=" + bread.getBreadTypeEnum() +
                ", cheese=" + cheese.getCheeseTypeEnum() +
                ", egg=" + egg.getEggTypeEnum() +
                ", ham=" + ham.getHamTypeEnum() +
                ", tomato=" + tomato.getTomatoTypeEnum() +
                '}';
    }
    public Hamburguer() {
     
        this.bread = breadFactory();
        this.cheese = cheeseFactory();
        this.egg = eggFactory();
        this.ham = hamFactory();
        this.tomato = tomatoFactory();
    }

    public Bread breadFactory() {
        return new Bread(BreadTypeEnum.Padrao);

    }

    public Cheese cheeseFactory() {

        return new Cheese(CheeseTypeEnum.Padrao);
    }

    public Egg eggFactory() {

        return new Egg(EggTypeEnum.Padrao);
    }

    public Ham hamFactory() {

        return new Ham(HamTypeEnum.Padrao);
    }

    public Tomato tomatoFactory() {

        return new Tomato(TomatoTypeEnum.Padrao);
    }

}