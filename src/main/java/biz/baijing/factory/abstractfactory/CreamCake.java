package biz.baijing.factory.abstractfactory;

/**
 * 工厂模式 - 蛋糕实体类 ： 奶油蛋糕实体类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class CreamCake extends Cake{
    @Override
    public void show() {
        System.out.println("奶油蛋糕 creamcake");
    }
}
