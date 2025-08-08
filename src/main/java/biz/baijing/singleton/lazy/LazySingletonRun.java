package biz.baijing.singleton.lazy;

/**
 * 入口方法
 * @version 0.1
 * @author  BaiJing.biz
 */
public class LazySingletonRun {
    public static void main(String[] args) {

        LazySingleton instance = LazySingleton.getInstance();

        LazySingleton instance1 = LazySingleton.getInstance();

        System.out.println(instance==instance1);


    }
}
