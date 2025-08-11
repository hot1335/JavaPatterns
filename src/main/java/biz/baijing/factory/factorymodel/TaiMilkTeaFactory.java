package biz.baijing.factory.factorymodel;

/**
 * 工厂模式 - TaiMilkTea工厂类，生产 TaiMilkTea
 * @version 0.1
 * @author  BaiJing.biz
 */
public class TaiMilkTeaFactory implements MilkTeaFactory {
    @Override
    public MilkTea createMilkTea() {
        return new TaiMilkTea();
    }
}
