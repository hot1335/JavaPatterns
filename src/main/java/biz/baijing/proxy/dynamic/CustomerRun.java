package biz.baijing.proxy.dynamic;

public class CustomerRun {
    public static void main(String[] args) {

        // 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();

        // 获取代理对象
        Trade proxyObject = factory.getProxyObject();

        // 调用具体的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true) {}

    }
}
