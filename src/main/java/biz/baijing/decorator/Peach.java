package biz.baijing.decorator;

/**
 * 装饰器模式 - 装饰者角色 ： 继承装饰者类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Peach extends DecoratorClass {


    public Peach(Cake cake) {
        super(cake, "桃子", 2, "装饰的桃子");
    }

    @Override
    public int cost() {
        return getPrice() + getCake().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getCake().getDesc();
    }
}
