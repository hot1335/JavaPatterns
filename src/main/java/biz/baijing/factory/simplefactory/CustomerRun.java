package biz.baijing.factory.simplefactory;

import biz.baijing.factory.originalmode.MilkTea;

/**
 * 工厂模式 - 子类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class CustomerRun {
    public static void main(String[] args) {

        MilkTeaStore store = new MilkTeaStore();

        MilkTea milkTea = store.OrderMilkTea("tai");

        System.out.println(milkTea.getName());

    }
}
