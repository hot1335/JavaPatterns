package biz.baijing.singleton.enger;

/**
 * 单例模式 - 饿汉式 ： 静态变量
 * @version 0.1
 * @author  BaiJing.biz
 */
public class EagerSingletonStaticVariable {

    // 创建本类对象
    private static EagerSingletonStaticVariable instance = new EagerSingletonStaticVariable();

    // 构造函数为 private 本类不会被实例化
    private EagerSingletonStaticVariable(){}

    // 对外获取对象实例的方法
    public static EagerSingletonStaticVariable getInstance(){
        return instance;
    }

    // 实例调用的测试方法
    public void showSu() {
        System.out.println("EagerSingletonStaticVariable");
    }

}
