package biz.baijing.visitor;

/**
 * 访问者模式 - 访问者实现类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class OtherPeople implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("访客，喂猫 ～～～ 喵喵喵");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("访客，喂狗  汪汪汪 ～～～");
    }
}
