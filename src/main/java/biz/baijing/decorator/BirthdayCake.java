package biz.baijing.decorator;

/**
 * 装饰器模式 - 具体构建 ： 生日蛋糕
 * @version 0.1
 * @author  BaiJing.biz
 */
public class BirthdayCake extends Cake {

    public BirthdayCake() {
        super("生日蛋糕",20,"给过生日的人吹蜡烛的蛋糕。");
    }

    @Override
    public int cost() {
        return getPrice();
    }
}
