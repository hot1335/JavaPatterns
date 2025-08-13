package biz.baijing.visitor;

/**
 * 访问者模式 - 抽象元素角色
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface Animal {

     void accept(Person visitor);

}
