package biz.baijing.singleton.enger;

public class EagerSingletonStaticVariable {

    // 创建本类对象
    private static EagerSingletonStaticVariable instance = new EagerSingletonStaticVariable();

    // 构造函数为 private 本类不会被实例化
    private EagerSingletonStaticVariable(){}

    // 对外获取对象实例的方法
    public static EagerSingletonStaticVariable getInstance(){
        return instance;
    }

    public void showSu() {
        System.out.println("EagerSingletonStaticVariable");
    }

}
