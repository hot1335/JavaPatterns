package biz.baijing.decorator;

/**
 * 装饰器模式 - 装饰者角色 ： 继承装饰者类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Apple extends DecoratorClass {


    public Apple(Cake cake) {
        super(cake, "苹果", 5, "苹果");
    }

    @Override
    public int cost() {
        return getPrice() + getCake().getPrice();
    }

    @Override
    public String getName() {
        return super.getName() + getCake().getName();
    }
}
