package biz.baijing.singleton.lazy;

/**
 * 单例模式 - 懒汉式
 * @version 0.1
 * @author  BaiJing.biz
 */
public class LazySingleton {

    // 声明 LazySingleton 的静态类型变量
    // DCL 模式 volatile 关键词避免空指针
    // volatile 关键字用于修饰变量，它确保了多线程环境下变量的可见性和有序性
    private static volatile LazySingleton instance;

    // 创建私有构造方法
    private  LazySingleton() {}

    // 对外提供访问 ， synchronized 确保线程安全
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            // 多线程情况 - 线程1，等待；线程2 ，等待 ；…… 生成多个实例，就非多线程了
            instance = new LazySingleton();
        }

        return instance;
    }

    // 线程安全，双重锁检查 DCL，即 double-checked locking
    // 多线程情况下有可能出现空指针，jvm 会进行指令重排造成的，深入了解 Java 并发编程获悉详情
    // 解决方法 通过 volatile 关键字
    public static LazySingleton getInstanceDCL() {
        if (instance == null) {
            synchronized(LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }

    /*
        volatile关键字与synchronized关键字的区别:
        volatile是轻量级的同步机制，而synchronized是重量级的同步机制。
        .
        synchronized会引起线程上下文的切换和调度，而volatile不会。
        volatile只能保证变量的可见性和有序性，而synchronized还可以保证原子性。
        .
        volatile不能保证对变量的复合操作（如i++）的原子性，而synchronized可以。
     */

}
