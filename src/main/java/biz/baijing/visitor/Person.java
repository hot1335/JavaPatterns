package biz.baijing.visitor;

/**
 * 访问者模式 - 访问者接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface Person {
    // 投喂动作
    void feed(Cat cat);
    void feed(Dog dog);
}
