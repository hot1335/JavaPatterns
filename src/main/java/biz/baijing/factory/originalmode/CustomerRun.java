package biz.baijing.factory.originalmode;

/**
 * 工厂模式 - 测试
 * @version 0.1
 * @author  BaiJing.biz
 */
public class CustomerRun {
    public static void main(String[] args) {

        MilkTeaStore store = new MilkTeaStore();

        MilkTea milkTea = store.orderMilkTea("lu");


        System.out.println(milkTea.getName());

    }
}
