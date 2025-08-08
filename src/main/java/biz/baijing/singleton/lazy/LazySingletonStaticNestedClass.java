package biz.baijing.singleton.lazy;

/**
 * 单例模式 - 懒汉式 : 私有内部类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class LazySingletonStaticNestedClass {

    // 私有构造方法
    private LazySingletonStaticNestedClass() {}

    // 定义内部静态类
    // JVM 加载外部类的时候不会加载静态内部类，只有内部类的属性/方法被调用时才会被加载并初始化其静态属性
    // static 修饰了内部类，确保内部类只会被实例化一次并严格遵循了时序性
    private static class LazySingletonStaticNestedClassHolder {
        // 内部类声明并初始化外部类对象
        // INSTANCE 大写是因为被 final 修饰
        private static final LazySingletonStaticNestedClass INSTANCE = new LazySingletonStaticNestedClass();

    }

    public static LazySingletonStaticNestedClass getInstance() {
        return LazySingletonStaticNestedClassHolder.INSTANCE;
    }

}
