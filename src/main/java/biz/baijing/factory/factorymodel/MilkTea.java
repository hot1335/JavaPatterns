package biz.baijing.factory.factorymodel;

/**
 * 工厂模式
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class MilkTea {

    public abstract String getName();

    public void addSuger() {
        System.out.println("add suger 2");
    }

    public void addMilk() {
        System.out.println("add Milk");
    }
}
