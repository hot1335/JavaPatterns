package biz.baijing.decorator;

/**
 * 装饰器模式 - 装饰者 ： 继承蛋糕类
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class DecoratorClass extends Cake{

    private Cake cake;

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public DecoratorClass(Cake cake,String name,int price,String desc) {
        super(name,price,desc);
        this.cake = cake;
    }

}
