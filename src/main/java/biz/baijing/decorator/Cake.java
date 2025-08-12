package biz.baijing.decorator;

/**
 * 装饰器模式 - 抽象构建 ： 蛋糕类
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class Cake {

    private String name;
    private int price;
    private String desc;

    public Cake(){}

    public Cake(String name, int price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public abstract int cost();

}
