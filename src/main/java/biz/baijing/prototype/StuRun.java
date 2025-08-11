package biz.baijing.prototype;

/**
 * 原型模式 - 毕业证案例
 * @version 0.1
 * @author  BaiJing.biz
 */
public class StuRun {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*
            必须实现 Clone and Cloneable接口
         */
        Diploma diploma = new Diploma();

        // Clone 毕业证对象
        Diploma clone = diploma.clone();

        diploma.setName("John");
        clone.setName("Tom 汤姆");

        diploma.show();
        clone.show();

        System.out.println(diploma);
        System.out.println(clone);
        System.out.println(diploma == clone);

    }
}
