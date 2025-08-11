package biz.baijing.factory.abstractfactory;

/**
 * 工厂模式 - 奶油 tai奶茶和奶油蛋糕一个风味
 * @version 0.1
 * @author  BaiJing.biz
 */
public class CreamFactory implements CakeAndMilkTeaFactory{
    @Override
    public MilkTea createMilkTea() {
        return new TaiMilkTea();
    }

    @Override
    public Cake createCake() {
        return new CreamCake();
    }
}
