package biz.baijing.prototype;

/**
 * 原型模式 - 毕业证案例
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

}
