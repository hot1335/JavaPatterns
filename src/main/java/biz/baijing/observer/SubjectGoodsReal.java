package biz.baijing.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者 - 主题实现类 ： 拍卖品
 * @version 0.1
 * @author  BaiJing.biz
 */
public class SubjectGoodsReal implements SubjectGoods{

    // 存储观察者对象 —— 多个
    private List<Observer> auctioneer = new ArrayList<Observer>();

    @Override
    public void Subscribe(Observer observer) {
        auctioneer.add(observer);
    }

    @Override
    public void UnSubscribe(Observer observer) {
        auctioneer.add(observer);
    }

    @Override
    public void notify(int price) {
        for (Observer observer : auctioneer) {
            // 拍卖品价格变化，更新给每一个拍卖者
            observer.update(price);
        }
    }
}
