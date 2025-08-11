package biz.baijing.factory.abstractfactory;

/**
 * 工厂模式 - 蛋糕实体类 ： 慕斯蛋糕实体类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MousseCake extends Cake {
    @Override
    public void show() {
        System.out.println("MousseCake 慕斯");
    }
}
