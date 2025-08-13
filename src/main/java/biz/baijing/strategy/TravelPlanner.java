package biz.baijing.strategy;

/**
 * 策略模式 - 环境类（context）聚合策略类 ： 旅行规划师
 * @version 0.1
 * @author  BaiJing.biz
 */
public class TravelPlanner {

    private Transportation transportation;

    public TravelPlanner(Transportation transportation) {
        this.transportation = transportation;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    // 销售旅行规划，并旅行
    public void saleTtravelplan() {
        System.out.println("已经完成旅行计划，并付款。");
        transportation.run();

    }
}
