package biz.baijing.mediator;

/**
 * 中介者模式 - 抽象同事类
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class Person {

    // 租赁者或设备放的名字 —— 同事名字
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
