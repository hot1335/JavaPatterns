package biz.baijing.prototype;

/**
 * 原型模式 - 浅克隆 : 毕业证案例
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Diploma implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Diploma clone() throws CloneNotSupportedException {
        return (Diploma) super.clone();
    }

    public void show() {
        System.out.println(name + " 于2025年毕业于 BaiJing Tech University !");
    }

}
