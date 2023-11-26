package entities;

import fillingsTypes.*;

abstract public class Hamburguer {

    private Bread bread;
    private Cheese cheese;
    private Egg egg;
    private Ham ham;
    private Tomato tomato;

    public Hamburguer() {
        // Inicialize as instâncias aqui ou em algum outro método, conforme necessário
        this.bread = breadFactory();
        this.cheese = cheeseFactory();
        this.egg = eggFactory();
        this.ham = hamFactory();
        this.tomato = tomatoFactory();
    }

    public Bread breadFactory() {
        return new Bread(BreadTypeEnum.Padrao);
//        bread.setBreadTypeEnum(BreadTypeEnum.Bola);
    }

    public Cheese cheeseFactory() {
//        cheese.setCheeseTypeEnum(CheeseTypeEnum.Mussarela);
        return new Cheese(CheeseTypeEnum.Padrao);
    }

    public Egg eggFactory() {
//        egg.setEggTypeEnum(EggTypeEnum.Granja);
        return new Egg(EggTypeEnum.Padrao);
    }

    public Ham hamFactory() {
//        ham.setHamTypeEnum(HamTypeEnum.Frango);
        return new Ham(HamTypeEnum.Padrao);
    }

    public Tomato tomatoFactory() {
//        tomato.setTomatoTypeEnum(TomatoTypeEnum.TomateVermelho);
        return new Tomato(TomatoTypeEnum.Padrao);
    }

//    @Override
//    public String toString() {
//        return "Hamburguer{" +
//                "bread=" + bread.getBreadTypeEnum() +
//                ", cheese=" + cheese.getCheeseTypeEnum() +
//                ", egg=" + egg.getEggTypeEnum() +
//                ", ham=" + ham.getHamTypeEnum() +
//                ", tomato=" + tomato.getTomatoTypeEnum() +
//                '}';
//    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "bread=" + bread.getBreadTypeEnum() +
                ", cheese=" + cheese.getCheeseTypeEnum() +
                ", egg=" + egg.getEggTypeEnum() +
                ", ham=" + ham.getHamTypeEnum() +
                ", tomato=" + tomato.getTomatoTypeEnum() +
                '}';
    }
}