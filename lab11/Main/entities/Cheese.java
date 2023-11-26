package entities;

import fillingsTypes.CheeseTypeEnum;

public class Cheese {

    private CheeseTypeEnum cheeseTypeEnum;

    public Cheese() {
    }

    public Cheese(CheeseTypeEnum cheeseTypeEnum) {
        this.cheeseTypeEnum = cheeseTypeEnum;
    }

    public String getCheeseTypeEnum() {
        return cheeseTypeEnum.name();
    }
}