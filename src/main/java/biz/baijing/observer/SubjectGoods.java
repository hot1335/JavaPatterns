package biz.baijing.observer;

/**
 * 观察者 - 主题抽象类 ： 拍卖品
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface SubjectGoods {

    // 观察者对象
    void Subscribe(Observer observer);

    // 删除观察者对象
    void UnSubscribe(Observer observer);

    // 通知观察者更新消息
    void notify(int price);
}
