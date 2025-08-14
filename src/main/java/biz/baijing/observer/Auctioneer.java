package biz.baijing.observer;

/**
 * 观察者 - 观察者实现类 ： 拍卖师
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Auctioneer implements Observer {

    private String name;
    public Auctioneer(String name) {
        this.name = name;
    }

    @Override
    public void update(int price) {
        System.out.println("Auctioneer " + this.name + " is now buying " + price);
    }
}
