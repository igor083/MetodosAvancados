package entities;

import fillingsTypes.EggTypeEnum;

public class Egg {
    private EggTypeEnum eggTypeEnum;

    public Egg() {
    }

    public Egg(EggTypeEnum eggTypeEnum) {
        this.eggTypeEnum = eggTypeEnum;
    }

    public String getEggTypeEnum() {
        return eggTypeEnum.name();
    }
}