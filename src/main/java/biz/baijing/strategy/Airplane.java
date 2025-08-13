package biz.baijing.strategy;

/**
 * 策略模式 - 具体策略类 ： 飞机
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Airplane implements Transportation {
    @Override
    public void run() {
        System.out.println("Airplane is running");
    }
}
