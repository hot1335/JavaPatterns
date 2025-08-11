package biz.baijing.factory.factorymodel;

/**
 * 工厂模式 - LuMilkTea 工厂对象，生产LuMilkTea
 * @version 0.1
 * @author  BaiJing.biz
 */
public class LuMilkTeaFactory implements MilkTeaFactory {
    @Override
    public MilkTea createMilkTea() {
        return new LuMilkTea();
    }
}
