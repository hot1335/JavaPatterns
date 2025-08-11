package biz.baijing.factory.abstractfactory;

/**
 * 工厂模式 - 接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface CakeAndMilkTeaFactory {
    // 生产咖啡
    MilkTea createMilkTea();

    // 生产蛋糕
    Cake  createCake();

}
