package biz.baijing.decorator;

/**
 * 装饰器模式 - 具体构建 ： 老人寿桃
 * @version 0.1
 * @author  BaiJing.biz
 */
public class ShoutaoCake extends Cake {

    public ShoutaoCake() {
        super("寿桃",10,"老人寿宴要用的装饰蛋糕。");
    }

    @Override
    public int cost() {
        return getPrice();
    }
}
