package biz.baijing.singleton.lazy;

/**
 * 单例模式 - 懒汉式
 * @version 0.1
 * @author  BaiJing.biz
 */
public class LazySingleton {

    // 声明 LazySingleton 的静态类型变量
    private static LazySingleton instance;

    // 创建私有构造方法
    private  LazySingleton() {}

    // 对外提供访问
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

}
