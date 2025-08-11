package biz.baijing.factory.abstractfactory;


import biz.baijing.factory.factorymodel.MilkTeaFactory;

public class CustomerRun {
    public static void main(String[] args) {

        // 慕斯风味的工厂
//        MousseFactory factory = new MousseFactory();

        CreamFactory factory = new CreamFactory();

        // 通过工厂生产
        Cake cake = factory.createCake();
        MilkTea milkTea = factory.createMilkTea();

        System.out.println(milkTea.getName());
        cake.show();

    }
}
