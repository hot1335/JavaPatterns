package biz.baijing.factory.abstractfactory;

/**
 * 工厂模式 - 慕斯 lu奶茶和慕斯蛋糕一样风味
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MousseFactory implements CakeAndMilkTeaFactory{
    @Override
    public MilkTea createMilkTea() {
        return new LuMilkTea();
    }

    @Override
    public Cake createCake() {
        return new MousseCake();
    }
}
