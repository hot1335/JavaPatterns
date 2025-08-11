package biz.baijing.factory.factorymodel;

/**
 * 工厂模式 - 奶茶店
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MilkTeaStore {

    private MilkTeaFactory factory;

    public void setFactory(MilkTeaFactory factory) {
        this.factory = factory;
    }

    public MilkTea orderMilkTea(){

        MilkTea milkTea = factory.createMilkTea();

        milkTea.addMilk();
        milkTea.addSuger();

        return milkTea;
    }
}
