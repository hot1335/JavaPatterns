package biz.baijing.factory.factorymodel;

/**
 * 工厂模式 - LuMilkTea抽象工厂，生产LuMilkTea
 * @version 0.1
 * @author  BaiJing.biz
 */
public class LuMilkTeaFactory implements MilkTeaFactory {
    @Override
    public MilkTea createMilkTea() {
        return new LuMilkTea();
    }
}
