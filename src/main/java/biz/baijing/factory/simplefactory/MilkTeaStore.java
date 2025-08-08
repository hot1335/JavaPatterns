package biz.baijing.factory.simplefactory;

import biz.baijing.factory.originalmode.MilkTea;

public class MilkTeaStore {

    public MilkTea OrderMilkTea(String taste){

        MilkTeaSimpleFactory factory = new MilkTeaSimpleFactory();

        MilkTea milkTea = factory.initMilkTea(taste);

        milkTea.addMilk();
        milkTea.addSuger();

        return milkTea;
    }
}
