package biz.baijing.factory.factorymodel;


public class MilkTeaStore {

    private MilkTeaFactory factory;

    public void setFactory(MilkTeaFactory factory) {
        this.factory = factory;
    }

    public MilkTea OrderMilkTea(String taste){

        MilkTea milkTea = factory.createMilkTea();

        milkTea.addMilk();
        milkTea.addSuger();

        return milkTea;
    }
}
