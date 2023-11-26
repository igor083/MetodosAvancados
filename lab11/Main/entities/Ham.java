package entities;


import fillingsTypes.HamTypeEnum;

public class Ham {

    private HamTypeEnum hamTypeEnum;

    public Ham() {

    }

    public Ham(HamTypeEnum hamTypeEnum) {
        this.hamTypeEnum = hamTypeEnum;
    }

    public String getHamTypeEnum() {
        return hamTypeEnum.name();
    }
}