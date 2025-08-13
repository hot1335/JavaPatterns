package biz.baijing.visitor;

/**
 * 访问者模式 - 具体元素角色
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Dog implements Animal {
    @Override
    public void accept(Person visitor) {
        visitor.feed(this);
        System.out.println("狗粮，汪汪汪");
    }
}
