package biz.baijing.prototype;

import java.io.Serializable;

/**
 * 原型模式 - 深克隆 : 毕业证案例
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
