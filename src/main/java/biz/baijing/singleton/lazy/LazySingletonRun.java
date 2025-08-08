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

        LazySingleton instance2 = LazySingleton.getInstanceDCL();

        LazySingleton instance3 = LazySingleton.getInstanceDCL();

        System.out.println(instance==instance3);

        System.out.println(instance2==instance3);

        LazySingletonStaticNestedClass instance4 = LazySingletonStaticNestedClass.getInstance();
        LazySingletonStaticNestedClass instance5 = LazySingletonStaticNestedClass.getInstance();
        System.out.println(instance4==instance5);


    }
}
