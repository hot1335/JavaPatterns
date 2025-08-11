package biz.baijing.factory.factorymodel;

/**
 * 工厂模式 - 顾客
 * @version 0.1
 * @author  BaiJing.biz
 */
public class CustomerRun {
    public static void main(String[] args) {

        MilkTeaStore store = new MilkTeaStore();

        MilkTeaFactory factory = new LuMilkTeaFactory();
        store.setFactory(factory);

        MilkTea milkTea = store.orderMilkTea();

        System.out.println(milkTea);

    }
}
