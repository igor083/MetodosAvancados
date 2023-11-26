package entities;

import fillingsTypes.BreadTypeEnum;

public class Bread {
    private BreadTypeEnum breadTypeEnum;

    public Bread() {
    }

    public Bread(BreadTypeEnum breadTypeEnum) {
        this.breadTypeEnum = breadTypeEnum;
    }

    public String getBreadTypeEnum() {
        return breadTypeEnum.name();
    }
}