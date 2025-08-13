package biz.baijing.strategy;

/**
 * 策略模式 - 具体策略类 ： 邮轮
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Cruiseship implements Transportation {
    @Override
    public void run() {
        System.out.println("Cruise ship run");
    }
}
